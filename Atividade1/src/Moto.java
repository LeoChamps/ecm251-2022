//Leonardo Campos 20.00786-8
public class Moto {
    private int id;
    private int tipo = 3; 

    
    public Moto(int id, int tipo){
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
