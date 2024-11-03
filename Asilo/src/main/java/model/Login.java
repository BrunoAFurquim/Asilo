package model;

public class Login {
    private final Repositorio repositorio;
    private Usuario usuario = null;
    private Adm adm = null;

    public Login(String email, String senha) throws Exception {
        this.repositorio = Repositorio.getInstance();

        this.usuario = this.repositorio.loginUsuario(email, senha);
        if (this.usuario == null) {
            this.adm = this.repositorio.loginAdm(email, senha);
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
        this.repositorio.salvarDados();
    }
}
