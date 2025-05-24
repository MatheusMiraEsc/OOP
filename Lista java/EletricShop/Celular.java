    public class Celular extends Mercadoria{
        public Celular(int codigo, String nome, double preco, double desconto){
            super(codigo, nome, preco, desconto);
        }
        
        @Override
        public double preco_a_vista(){
            return getPreco()-getPreco()*getDesconto()/100;
        } 
    }