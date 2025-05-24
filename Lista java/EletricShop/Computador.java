    public class Computador extends Mercadoria{
        String campo_de_configuracao;

        public Computador(int codigo, String nome, double preco, double desconto, String campo_de_configuracao){
            super(codigo, nome, preco, desconto);
            this.campo_de_configuracao = campo_de_configuracao;
        }
        @Override
        public double preco_a_vista(){
            return getPreco()-0.1*getPreco();
        }
    }

    