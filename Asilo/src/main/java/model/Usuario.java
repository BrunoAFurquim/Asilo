package model;

import java.io.Serializable;
import java.util.UUID;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;
    private String nome;
    private String email;
    private String senha; // armazenada como hash
    private String endereco;
    private String telefone;

    public Usuario(String nome, String email, String senha, String endereco, String telefone) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
