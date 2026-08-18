import java.util.Scanner;

public class ArraySwitch {
    static String[] produtos = new String[5]; 
    static int quantidade = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarProduto(sc);
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void adicionarProduto(Scanner sc) {

        if (quantidade == produtos.length) {
            aumentarArray();
        }

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        produtos[quantidade] = nome;
        quantidade++;
        System.out.println("Produto adicionado!");
    }

    static void aumentarArray() {
        int novoTamanho = produtos.length * 2; 
        String[] novoArray = new String[novoTamanho];


        for (int i = 0; i < produtos.length; i++) {
            novoArray[i] = produtos[i];
        }

        produtos = novoArray;
        System.out.println("Array redimensionado para " + novoTamanho);
    }

    static void listarProdutos() {
        System.out.println("\n- Produtos cadastrados -");
        if (quantidade == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.println((i + 1) + " - " + produtos[i]);
        }
    }
}
