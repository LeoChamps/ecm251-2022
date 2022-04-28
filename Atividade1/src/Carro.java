//Leonardo Campos 20.00786-8
public class Carro {
    private int id;
    private int tipo = 2; 

    public Carro(int id, int tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo(){
        return tipo;
    }

}
