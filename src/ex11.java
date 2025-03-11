/*
*****11*****
Desenvolva um programa em Java que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.
(formula Δ = b2 – 4ac)
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex11 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar do usuário 3 valores, A,B e C
                2 - Realizar a fórmula para descobrir o Delta
                3- Imprimir o delta
                """.stripIndent());
        Scanner conta = new Scanner(System.in);

        System.out.println("Digite a varável A da equação: ");
        int a = conta.nextInt();
        System.out.println("Digite a varável B da equação: ");
        int b = conta.nextInt();
        System.out.println("Digite a varável C da equação: ");
        int c = conta.nextInt();
        conta.close();
        System.out.println("O resultado de Δ = " + ((b * b) - (4 * a * c)));
    }
}
