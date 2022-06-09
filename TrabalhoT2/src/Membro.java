public abstract class Membro implements PostarMensagem {
    private final String usuario;
    private final String email;
    private Funcao funcao;
    

    public Membro(String usuario, String email, Funcao funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Membro [usuario=" + usuario + ", email=" + email + ", funcao=" + funcao + "]";
    }

 
}
