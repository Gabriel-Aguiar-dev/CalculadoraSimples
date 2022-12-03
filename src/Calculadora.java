import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int n1, n2;
        int soma, subtracao, multiplaicacao, divisao;
        int op;
        String sair;

        Scanner entrada = new Scanner(System.in);

        System.out.println("=======> SELECIONE UMA OPERACAO <=======");

        System.out.println("[1] -> SOMAR");
        System.out.println("[2] -> SUBTRAIR");
        System.out.println("[3] -> MULTIPLICAR");
        System.out.println("[4] -> DIVIDIR");
        System.out.println("[5] -> SAIR DA CALCULADORA");

        System.out.println("               ");
        System.out.println(">>>>>>>>>>>> Digite sua opção: ");

        op = entrada.nextInt();

        System.out.println("Informe o primeiro valor: ");
        n1 = entrada.nextInt();

        System.out.println("Informe o segundo valor: ");
        n2 = entrada.nextInt();

        switch (op) {
            case 1:
                soma = n1 + n2;
                System.out.println("O resultado da soma é: " + soma);
                break;

            case 2:
                subtracao = n1 - n2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;

            case 3:
                multiplaicacao = n1 * n2;
                System.out.println("O resultado dao é: " + multiplaicacao);
                break;

            case 4:
                if (n1 < n2) {
                    System.out.println("Imposivel realizar o calculo");
                } else {
                    divisao = n1 / n2;
                    System.out.println("O resultado da divisão é: " + divisao);
                    break;

                }
        }
    }
}
