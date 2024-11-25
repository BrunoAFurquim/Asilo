package dao;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Adm;
import model.Asilo;
import model.DoacaoMonetaria;
import model.Necessidade;
import model.Publicacao;
import model.Usuario;
import model.util.Email;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class DAO implements Serializable {

    private static final long serialVersionUID = 1L;
    private static DAO instancia;

    private final ArrayList<Usuario> usuarios;
    private final ArrayList<DoacaoMonetaria> doacoes;
    private final ArrayList<Necessidade> necessidades;
    private final ArrayList<Necessidade> necessidadesAtendidas;
    private final ArrayList<Publicacao> publicacoes;
    private Asilo asilo;
    private Adm adm;

    public DAO() {
        usuarios = new ArrayList<>();
        doacoes = new ArrayList<>();
        necessidades = new ArrayList<>();
        necessidadesAtendidas = new ArrayList<>();
        publicacoes = new ArrayList<>();
        asilo = null;
        adm = null;
    }

    public static DAO getInstance() {

        if (instancia == null) {
            instancia = carregarDados();
            if (instancia == null) {
                instancia = new DAO();
                instancia.cadastrarAdm("admin", "admin", "admin", 40028922);
                instancia.asilo = new Asilo();
            }
        }
        return instancia;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Adm getAdm() {
        return adm;
    }

    public void removerUsuario(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
        salvarDados();
    }

    public Asilo getAsilo() {
        return asilo;
    }

    public ArrayList<Necessidade> getNecessidades() {
        return necessidades;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public ArrayList<DoacaoMonetaria> getDoacoes() {
        return doacoes;
    }

    public ArrayList<Necessidade> getNecessidadesAtendidas() {
        return necessidadesAtendidas;
    }

    public DoacaoMonetaria cadastrarDoacao(double valor, String emailDoador, String metodo) throws IOException {
        Usuario doador = getUsuarioPorEmail(emailDoador);
        Email email = new Email();
        email.notificarDoacao(doador, valor);
        DoacaoMonetaria doacao = new DoacaoMonetaria(valor, emailDoador, metodo);
        doacoes.add(doacao);
        salvarDados();  
        return doacao;
    }

    private String hashSenha(String senha) {
        return BCrypt.hashpw(senha, BCrypt.gensalt());
    }

    private boolean checkSenha(String senha, String hashed) {
        return BCrypt.checkpw(senha, hashed);
    }

    public Usuario cadastrarUsuario(String nome, String email, String senha, String endereco, String telefone) {
        Usuario usuario = new Usuario(nome, email, hashSenha(senha), endereco, telefone);
        usuarios.add(usuario);
        salvarDados();
        return usuario;
    }


    public Usuario atualizarUsuario(String id, String nome, String email, String senha, String endereco, String telefone) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setSenha(hashSenha(senha));
                usuario.setEndereco(endereco);
                usuario.setTelefone(telefone);
                salvarDados();
                return usuario;
            }
        }
        return null;
    }

    public Usuario atualizarUsuario(String id, String nome, String email, String endereco, String telefone) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setEndereco(endereco);
                usuario.setTelefone(telefone);
                salvarDados();
                return usuario;
            }
        }
        return null;
    }

    public Usuario atualizarSenhaUsuario(String id, String novaSenha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setSenha(hashSenha(novaSenha));
                salvarDados();
                return usuario;
            }
        }
        return null;
    }

    // Cadastrar Administrador com segurança na senha
    public Adm cadastrarAdm(String nome, String email, String senha, int telefone) {
        Adm adm = new Adm(nome, email, hashSenha(senha), telefone);
        this.adm = adm;
        salvarDados();
        return adm;
    }

    public Adm atualizarAdm(String nome, String email, String senha, int telefone) {
        if (this.adm != null && adm.getNome().equals(nome)) {
            adm.setEmail(email);
            adm.setSenha(hashSenha(senha));
            adm.setTelefone(telefone);
            salvarDados();
            return adm;
        }
        return null;
    }

    public Adm atualizarAdm(String nome, String email, int telefone) {
        if (this.adm != null && adm.getNome().equals(nome)) {
            adm.setEmail(email);
            adm.setTelefone(telefone);
            salvarDados();
            return adm;
        }
        return null;
    }

    public Adm atualizarSenhaAdm(String novaSenha) {
        this.adm.setSenha(hashSenha(novaSenha));
        salvarDados();
        return adm;
    }

    // Cadastrar Asilo
    public Asilo cadastrarAsilo(String nome, String endereco, String telefone, String email, String chavePix) {
        Asilo asilo = new Asilo(nome, endereco, telefone, email, chavePix, 0.0);
        this.asilo = asilo;
        salvarDados();
        return asilo;
    }

    // Atualizar Asilo
    public Asilo atualizarAsilo(String nome, String endereco, String telefone, String email, String chavePix) {
        asilo.setNome(nome);
        asilo.setEndereco(endereco);
        asilo.setTelefone(telefone);
        asilo.setEmail(email);
        asilo.setChavePix(chavePix);
        salvarDados();
        return asilo;

    }

    public Asilo atualizarMeta(double meta) {
        asilo.setMeta(meta);
        salvarDados();
        return asilo;
    }

    public double getMeta() {
        return asilo.getMeta();
    }

    // Criar Necessidade
    public Necessidade criarNecessidade(String nome, String descricao, String categoria) {
        Necessidade necessidade = new Necessidade(nome, descricao, categoria);
        necessidades.add(necessidade);
        salvarDados();
        return necessidade;
    }

    public Necessidade addNecessidadeAtendida(Necessidade necessidade) {
        necessidadesAtendidas.add(necessidade);
        salvarDados();
        return necessidade;
    }

    // Atualizar Necessidade
    public void atualizarNecessidade(String id, String nome, String descricao, String categoria) {
        for (Necessidade necessidade : necessidades) {
            if (necessidade.getId().equals(id)) {
                necessidade.setNome(nome);
                necessidade.setDescricao(descricao);
                necessidade.setCategoria(categoria);
                salvarDados();
            }
        }
    }

    // Criar Publicação
    public void criarPublicacao(String titulo, String descricao) {
        Publicacao publicacao = new Publicacao(titulo, descricao);
        publicacoes.add(publicacao);
        salvarDados();
    }

    public void deletarPublicacao(String id) {
        publicacoes.removeIf(publicacao -> publicacao.getId().equals(id));
        salvarDados();
    }

    public Publicacao atualizarPublicacao(String id, String titulo, String descricao) {
        for (Publicacao publicacao : publicacoes) {
            if (publicacao.getId().equals(id)) {
                publicacao.setTitulo(titulo);
                publicacao.setDescricao(descricao);
                salvarDados();
                return publicacao;
            }
        }
        return null;
    }

    // Deletar Necessidade
    public void deletarNecessidade(String id) {
        necessidades.removeIf(necessidade -> necessidade.getId().equals(id));
        salvarDados();
    }

    // Geração de Relatório de Transparência
    public String gerarRelatorioTransparencia() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório de Transparência\n");
        relatorio.append("===========================\n\n");

        relatorio.append("Doações Recebidas:\n");
        double totalDoacoes = 0.0;
        for (DoacaoMonetaria doacao : doacoes) {
            relatorio.append("Doação de ").append(doacao.getValor()).append(" de ").append(doacao.getDoador()).append("\n");
            totalDoacoes += doacao.getValor();
        }
        relatorio.append("Total de Doações Recebidas: ").append(totalDoacoes).append("\n\n");

        relatorio.append("Aplicações dos Recursos:\n");
        // Detalhamento de como os recursos foram aplicados
        relatorio.append("Impacto Direto no Funcionamento do Asilo:\n");
        // Descrição do impacto

        return relatorio.toString();
    }

    // Geração de Relatório Mensal de Arrecadações
    public String gerarRelatorioMensalArrecadacoes(Date mesAno) {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório Mensal de Arrecadações\n");
        relatorio.append("Mês: ").append(new SimpleDateFormat("MM/yyyy").format(mesAno)).append("\n\n");

        double totalArrecadado = 0.0;
        int quantidadeItens = 0;
        for (DoacaoMonetaria doacao : doacoes) {
            if (isSameMonth(doacao.getData(), mesAno)) {
                totalArrecadado += doacao.getValor();
                quantidadeItens++; // Supondo que cada doação monetária seja um item
                relatorio.append("Doação de ").append(doacao.getValor()).append(" de ").append(doacao.getDoador()).append("\n");
            }
        }

        relatorio.append("Total Arrecadado: ").append(totalArrecadado).append("\n");
        relatorio.append("Quantidade de Itens Doado: ").append(quantidadeItens).append("\n\n");

        relatorio.append("Metas vs Realidade:\n");
        // Comparativo entre metas e arrecadações

        return relatorio.toString();
    }

    private boolean isSameMonth(String date1, Date date2) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        return date1.equals(fmt.format(date2));
    }

    public void salvarDados() {
        try (FileOutputStream fileOut = new FileOutputStream("dados.txt"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DAO carregarDados() {
        try (FileInputStream fileIn = new FileInputStream("dados.txt"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (DAO) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Usuario loginUsuario(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && checkSenha(senha, usuario.getSenha())) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario getUsuarioPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public Adm loginAdm(String email, String senha) {
        if (adm != null && adm.getEmail().equals(email) && checkSenha(senha, adm.getSenha())) {
            return adm;
        }
        return null;
    }

}
