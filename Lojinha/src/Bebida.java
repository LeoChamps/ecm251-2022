public class Bebida extends Produto {
    public final EnumCategoriaBebida categoria;
    public final EnumTemperatura temperatura;
    
    public Bebida(double preço, String nome, int quantidade, String descriçao, EnumCategoriaBebida categoria,
            EnumTemperatura temperatura) {
        super(preço, nome, quantidade, descriçao);
        this.categoria = categoria;
        this.temperatura = temperatura;
    }

    @Override
    public double gerarDesconto() {
        return getPreço() * 0.90;
    }

}
