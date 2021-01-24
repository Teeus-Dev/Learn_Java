import java.util.Locale;
import java.util.Scanner;
/*
*  ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
*  mensagem explicativa, conforme exemplos
*
* Exemplos:
Entrada:10
Saída:30
SOMA = 40
Entrada:-30
Saída:10
SOMA = -20
Entrada:Saída:00SOMA = 0*/

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entradaUm, entradaDois, entradaTreis ,saidaUm, saidaDois, saidaTreis;
        int somaUm, somaDois, somaTreis;


        entradaUm = sc.nextInt();
        saidaUm = sc.nextInt();
        entradaDois = sc.nextInt();
        saidaDois = sc.nextInt();
        entradaTreis = sc.nextInt();
        saidaTreis = sc.nextInt();

        somaUm = entradaUm + saidaUm;
        somaDois = entradaDois + saidaDois;
        somaTreis = entradaTreis + saidaTreis;


        System.out.println("O valor da entrada 1 é: " + entradaUm);
        System.out.println("O valor da saida 1 é: " + saidaUm);
        System.out.println("O valor da Soma 1 é: " + somaUm);

        System.out.println("O valor da entrada 2 é: " + entradaDois);
        System.out.println("O valor da saida 2 é: " + saidaDois);
        System.out.println("O valor da soma 2 é: " + somaDois);


        System.out.println("O valor da entrada 3 é: " + entradaTreis);
        System.out.println("O valor da saida 3 é: " + saidaTreis);
        System.out.println("O valor da soma 3 é: " + somaTreis);
        sc.close();
    }

}
