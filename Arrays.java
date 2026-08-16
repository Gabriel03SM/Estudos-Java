import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[6];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = (double) soma / notas.length;

      int maior = notas[0];
      int menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        int acimaDaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Notas acima da média: " + acimaDaMedia);
        sc.close();
    }
}
