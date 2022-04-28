//Leonardo Campos 20.00786-8
public class Usuario {
    protected String nome;
    public String veiculo; 
    
    public Usuario(String nome, String veiculo){
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setVeiculo(String veiculo){
        this.veiculo = veiculo;
    }

    public String getVeiculo(){
        return veiculo;
    }
}
