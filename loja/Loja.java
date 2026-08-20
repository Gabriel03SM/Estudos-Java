package EstudosIntermediario;

public class Loja {
    public static void main(String[] args) {
        Produto leite = new Produto();
        leite.nome = "Leite Italac";
        leite.estoque = 12;
        leite.valor = 7.99;

        System.out.printf("Produto: %s | Estoque: %d | Preço: R$ %.2f\n", leite.nome, leite.estoque, leite.valor);


    }
}
