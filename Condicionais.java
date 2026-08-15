import java.util.Scanner;
public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mensalidadeBase = 1500.00;
        int descontoPorCento = 0;

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do ENEM (0-1000): ");
        int nota = scanner.nextInt();

        if(nota > 1000 || nota < 0){
            System.out.println("digite uma nota válida!!");
            scanner.close();
            return;
        }

        System.out.print("Digite a renda familiar (em reais R$): ");
        double renda = scanner.nextDouble();

        if (nota < 600){
            System.out.println("Não elegível para bolsa de estudos");
        } else if (nota <= 750){
            System.out.println("bolsa parcial: 30% de desconto!");
            descontoPorCento = 30;
        } else if (nota <= 900){
            System.out.println("Bolsa avançada: 50% de desconto!");
            descontoPorCento = 50;
        } else if (nota > 900){
            System.out.println("Bolsa Integral! ");
            descontoPorCento = 100;
        }

        if (nota >= 600 && nota <= 900){
            if (renda <= 2800.00){
                System.out.println("O aluno ganha 10% de desconto no valor final");
                descontoPorCento += 10;
            }
        }

        switch (descontoPorCento) {
            case 30:
                System.out.println("O aluno recebeu 30% de desconto");
                break;
            case 40:
                System.out.println("O aluno recebeu e 30% de desconto mais 10% bonus");
                break;
            case 50:
                System.out.println("O aluno recebeu 50% de desconto");
                break;
            case 60:
                System.out.println("O aluno recebeu 50% de desconto mais 10% de bonus");
                break;
            case 100:
                System.out.println("O aluno recebeu bolsa integral!");
                break;
            default:
                System.out.println("O aluno não recebeu bolsa de estudos");
        }

        double valorFinal = mensalidadeBase * (1 - descontoPorCento / 100.0);
        System.out.printf("Valor final da mensalidade: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
