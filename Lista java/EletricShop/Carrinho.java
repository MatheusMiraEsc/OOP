// 4. Para o sistema EletricShop, crie uma classe Carrinho para abrigar as
// mercadorias compradas por um cliente. Ela deve possuir como atributos: código
// do cliente, nome e um conjunto de mercadorias. Essa classe deverá armazenar
// as mercadorias em um ArrayList.
// A classe deverá possuir os seguintes métodos:

// • public void cadastrar(Mercadoria m) -> insere a mercadoria no vetor,
// dando uma mensagem de erro se o vetor estiver cheio ou a mercadoria
// for nula.

// • public void remover(Mercadoria m) -> remove a mercadoria no vetor,
// dando uma mensagem de erro se não encontrar ou a mercadoria for nula.

// • public void conteudo() -> Imprime o código, nome e preço de todas as
// mercadorias no carrinho. Ao final, imprime o total de itens e o valor total
// das mercadorias no carrinho.


import java.util.ArrayList;

public class Carrinho {
    private int cod_cliente;
    private String nome;
    private ArrayList<Mercadoria> mercadorias;

    public Carrinho(int cod_cliente, String nome){
        this.cod_cliente=cod_cliente;
        this.nome=nome;
        this.mercadorias = new ArrayList<Mercadoria>();
    }

    public int getCod_cliente() {
        return cod_cliente;
    }
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Mercadoria> getMercadorias() {
        return mercadorias;
    }
    public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public Mercadoria procurar(int codigo){
        ArrayList<Mercadoria> mercadorias = getMercadorias();
        for(Mercadoria mercadoria : mercadorias){
            if(codigo==mercadoria.getCodigo()){
                return mercadoria;
            }
        }
        return null;
    }

    
// • public void cadastrar(Mercadoria m) -> insere a mercadoria no vetor,
// dando uma mensagem de erro se o vetor estiver cheio ou a mercadoria
// for nula.
    public void cadastrar(Mercadoria m){
        ArrayList<Mercadoria> mercadorias = getMercadorias();
        if(m == null){
            System.out.println("Mercadoria inválida");
            return;
        }
        mercadorias.add(m);
    }

    // • public void remover(Mercadoria m) -> remove a mercadoria no vetor,
// dando uma mensagem de erro se não encontrar ou a mercadoria for nula.


    public void remover(Mercadoria m){
        if(m == null){
            System.out.println("Mercadoria inválida");
            return;
        }
        Mercadoria encontrado = procurar(m.getCodigo());
        if(encontrado == null){
            System.out.println("Mercadoria não encontrada");
            return;
        };
        mercadorias.remove(encontrado);
    }
// • public void conteudo() -> Imprime o código, nome e preço de todas as
// mercadorias no carrinho. Ao final, imprime o total de itens e o valor total
// das mercadorias no carrinho.

    public void conteudo(){
        int total_itens=0;
        double valor_total=0;
        for(Mercadoria m : mercadorias){
            System.out.println("Codigo: " + m.getCodigo() + "\n"+
                               "Nome: " + m.getNome() + "\n" +
                               "Preço: " + m.getPreco()
            );
            total_itens++;
            valor_total+=m.getPreco();
        }
        System.out.println("Quantidade de itens: " + total_itens + "\n"+
                           "Preço final: " + valor_total
        );

    }
}
    