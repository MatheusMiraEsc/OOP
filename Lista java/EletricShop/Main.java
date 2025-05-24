public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho(1, "João");
        TelaCarrinho tela = new TelaCarrinho(carrinho);
        tela.iniciar();
    }
}
