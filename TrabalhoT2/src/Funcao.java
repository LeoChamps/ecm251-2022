public class Funcao {
    private String tipo;

    public Funcao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Funcao [" + tipo + "]";
    }
    
}
