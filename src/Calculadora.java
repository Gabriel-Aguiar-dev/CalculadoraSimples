import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int n1, n2;
        int soma, subtracao, multiplaicacao, divisao;
        int op;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        n1 = entrada.nextInt();

        System.out.println("Informe o segundo valor: ");
        n2 = entrada.nextInt();
        System.out.println("=======> SELECIONE UMA OPERACAO <=======");

        System.out.println("[1] -> SOMAR");
        System.out.println("[2] -> SUBTRAIR");
        System.out.println("[3] -> MULTIPLICAR");
        System.out.println("[4] -> DIVIDIR");
        System.out.println("               ");
        System.out.println(">>>>>>>>>>>> Digite sua opção: ");

        op = entrada.nextInt();

        switch (op) {
            case 1:
                soma = n1 + n2;
                System.out.println("A soma é: " + soma);
                break;
            case 2:
                subtracao = n1 - n2;
                System.out.println("A subtração é: " + subtracao);
                break;
            case 3:
                multiplaicacao = n1 * n2;
                System.out.println("A multiplicação é: " + multiplaicacao);
                break;
            case 4:
                if (n1 < n2) {
                    System.out.println("Imposivel realizar o calculo");
                } else {
                    divisao = n1 / n2;
                    System.out.println("A divisão é: " + divisao);
                    break;
                }
        }
    }
}