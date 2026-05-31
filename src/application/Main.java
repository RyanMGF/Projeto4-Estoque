package application;
import entities.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int qtd;
        System.out.print("Digite o nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.print("Digite o valor do produto: ");
        produto.preco = sc.nextDouble();
        System.out.print("Digite o quantidade do produto: ");
        produto.quantidadeEstoque = sc.nextInt();

        System.out.println("Você quer adicionar ou remover? 1 - Adicionar | 2 - Remover");
        int opcao;
        switch (opcao = sc.nextInt()) {
            case 1:
                System.out.println("Digite a quantide a ser adicionada: ");
                qtd = sc.nextInt();
                produto.adicionarEstoque(qtd);
                System.out.println("Produto atualizado, agora tem " + produto.quantidadeEstoque + " estoque adicionado");
                break;
            case 2:
                System.out.println("Digite a quantide a ser removido: ");
                qtd = sc.nextInt();
                produto.removerEstoque(qtd);
                System.out.println("Produto atualizado, agora tem " + produto.quantidadeEstoque + " estoque removido");
                break;
            default:
                System.out.println("Opção Inválida! ");
                break;
        }
        System.out.println(produto);

        sc.close();
    }
}