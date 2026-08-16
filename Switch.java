import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número de 1 a 3");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Seu dia de sorte");
                break;
            case 2:
                System.out.println("seu dia de morte é amanhã");
                break;
            case 3:
                System.out.println("hoje é um dia comum");
                break;
            default:
                System.out.println("digite o número!");
        }
    }
}
