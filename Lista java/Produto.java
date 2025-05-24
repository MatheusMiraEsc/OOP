// 6. Escreva uma classe Produto. Ela deverá possuir os seguintes atributos:
// código, nome e preço. A classe deverá usar encapsulamento, possuir um
// construtor e deverá lançar exceções do tipo IllegalArgumentException se os
// parâmetros não forem passados corretamente para o construtor bem como para
// os métodos set.

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    
    public Produto(int codigo, String nome, double preco){
        this.codigo=codigo;
        this.nome=nome;
        this.preco=preco;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        if(codigo<=0){
            throw new IllegalArgumentException("Código deve ser maior que zero.");
        }
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome==null){
            throw new IllegalArgumentException("Nome não pode ser nulo.");
        }
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }
}
