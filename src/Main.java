import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idPeca, qtd;
        double valorQTD, valorTotal;

        idPeca = sc.nextInt();
        qtd = sc.nextInt();
        valorQTD = sc.nextDouble();

        valorTotal = qtd * valorQTD;

        System.out.println(" Código da peça 1: " + idPeca);
        System.out.println(" Número de peças: " + qtd);
        System.out.printf(" Valor unitário da peça: R$ %.2f%n", valorQTD);
        System.out.println(" O valor a pagar é: " + valorTotal);


        sc.close();
    }

}