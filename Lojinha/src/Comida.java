public class Comida extends Produto {
    public final EnumCategoriaComida categoria;
    public final EnumAlergicos alergicos;
    public final EnumPimenta pimenta;

    public Comida(double preço, String nome, int quantidade, String descriçao, EnumCategoriaComida categoria,
            EnumAlergicos alergicos, EnumPimenta pimenta) {
        super(preço, nome, quantidade, descriçao);
        this.categoria = categoria;
        this.alergicos = alergicos;
        this.pimenta = pimenta;
    }

    @Override
    public double gerarDesconto() {
        return getPreço() * 0.95;
    }
    
}
