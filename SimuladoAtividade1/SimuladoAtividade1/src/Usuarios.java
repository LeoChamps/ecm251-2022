public class Usuarios {
    private String nome;
    private String senha;
    private String email;

    public Usuarios(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;

    }    

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return senha;
    }

    public String getEmail(){
        return email;
    }


}
