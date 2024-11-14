package model;

import instancia.DAO;



public class Login {
    private final DAO dao;
    private Usuario usuario = null;
    private Adm adm = null;

    public Login(String email, String senha) throws Exception {
        this.dao = DAO.getInstance();

        this.usuario = this.dao.loginUsuario(email, senha);
        if (this.usuario == null) {
            this.adm = this.dao.loginAdm(email, senha);
            if (this.adm == null) {
                 throw new LoginException("Usuário não encontrado");
            }
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Adm getAdm() {
        return adm;
    }

    public boolean isUsuarioLogado() {
        return usuario != null;
    }

    public boolean isAdmLogado() {
        return adm != null;
    }
    
    public void encerrarSessao(){
        this.dao.salvarDados();
    }
}
