public abstract class Produto implements IGerarDesconto {
    private final double preço;
    private final String nome;
    private int quantidade;
    private final String descricao;
    
    public Produto(double preço, String nome, int quantidade, String descriçao) {
        this.preço = preço;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descriçao;
    }

    public double getPreço() {
        return preço;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescriçao() {
        return descricao;
    }

}
