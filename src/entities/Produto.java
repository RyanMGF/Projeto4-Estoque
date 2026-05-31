package entities;

public class Produto {
    public String nome;
    public Double preco;
    public int quantidadeEstoque;

    public void adicionarEstoque(int qtd){
        this.quantidadeEstoque += qtd;
    }
    public void removerEstoque(int qtd){
        if (quantidadeEstoque < 0){
            System.out.println("Estoque negativo, não pode remover!");
        } else {
            this.quantidadeEstoque -= qtd;
        }
    }
    public String toString(){
        return "Seu estoque de " + nome + ", do preço: " +  preco +" tem " +  quantidadeEstoque + " no estoque.";
    }
}
