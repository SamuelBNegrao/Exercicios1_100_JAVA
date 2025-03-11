/*
*****09*****
Faça um programa em Java que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar.
Considere US$1,00 = R$3,45.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex09 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar que o usuário digite a quantidade de Reais que ele possui
                2 - Dividir esse valor por 3.45
                3 - Imprimir resultado
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja converter em dolar: ");
        float real = scanner.nextFloat();
        double dolar = real / 3.45;
        scanner.close();

        System.out.printf("Você possui cerca de$ = %.2f %n ", (dolar));


    }
}
