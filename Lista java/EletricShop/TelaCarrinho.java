// 5. Para o sistema EletricShop, crie uma classe TelaCarrinho onde o usuário
// visualizará um menu onde terá opções para inserir, remover e listar as
// mercadorias presentes no carrinho.
// Ao inserir uma mercadoria, o sistema deverá perguntar se ele está comprando
// um computador ou um celular, solicitando as informações de acordo com o
// produto escolhido.

import java.util.Scanner;

public class TelaCarrinho{
    private Carrinho carrinho;
    private final Scanner scanner = new Scanner(System.in);

    public TelaCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void iniciar() {
        while (true) {
            System.out.println("\n--- Carrinho de Compras ---");
            System.out.println("1 - Inserir mercadoria");
            System.out.println("2 - Remover mercadoria");
            System.out.println("3 - Listar mercadorias");

            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            String opc = scanner.nextLine();
    
            switch (opc) {
                case "1": inserir(); break;
                case "2": remover(); break;
                case "3": listar(); break;
                case "0": return;
                default: System.out.println("Opção inválida.\n");
            }
        }
    }

    public void inserir(){
        System.out.print("Qual tipo de produto? (1 - Celular, 2 - Computador): ");
        String tipo = scanner.nextLine();

        System.out.print("Código: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Desconto: ");
        double desconto = Double.parseDouble(scanner.nextLine());
        Mercadoria m = null;
        if(tipo.equals("1")){
            m = new Celular(codigo, nome, preco, desconto);

        }else if(tipo.equals("2")){
            System.out.print("Configurações:  ");
            String campo_de_configuracao = scanner.nextLine();
            m = new Computador(codigo, nome, preco, desconto, campo_de_configuracao);

        }else{
            System.out.print("Tipo Inválido");
            return;
        }
        carrinho.cadastrar(m);
        System.out.println("Produto adicionado com sucesso.");

    }
    public void remover(){
        listar();
        System.out.println("Digite o código do carrinho que deseja remover: ");
        int codigo = scanner.nextInt();
        Mercadoria mercadoria = carrinho.procurar(codigo);
        if(mercadoria != null){
            carrinho.remover(mercadoria);
        }else{
            System.out.println("Mercadoria não encontrada");
        }



    }
    public void listar(){
        carrinho.conteudo();
    }
}