public class ProdutoSimples extends Mercadoria{
        public ProdutoSimples(int codigo, String nome, double preco, double desconto){
            super(codigo, nome, preco, desconto);
        }
        @Override
        public double preco_a_vista(){
            return getPreco() * (1-getDesconto()/100);
        }
    }