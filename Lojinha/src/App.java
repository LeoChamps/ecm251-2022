public class App {
    public static void main(String[] args) throws Exception {
        Produto cornDog = new Comida(12.5, "Corn Dog", 5, "Cachorro quente de milho", EnumCategoriaComida.COREANA, EnumAlergicos.GLUTEM, EnumPimenta.COREANO);
        Produto acaiMoleza = new Bebida(10.5, "Acai do Moleza", 1, "Real fonte de energia", EnumCategoriaBebida.SUCO, EnumTemperatura.FRIO);

        System.out.println("Preços Regulares");
        System.out.println(cornDog.getNome() + " " + precoComDesconto(cornDog));
        System.out.println(acaiMoleza.getNome() + " " + precoComDesconto(acaiMoleza));
    }

    public static String precoComDesconto(IGerarDesconto produto){
        return "R$" + produto.gerarDesconto();
    }
}
