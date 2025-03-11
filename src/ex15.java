/*
*****15*****
Crie um programa Java que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário,
sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex15 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar o total de dias trabalhados durante o mês
                2 - Multiplicar 25 por 8 para obter a qtd de reais ganhos por dias trabalhados
                3 - multiplicar o total ganho pelos dias trabalhados. Imprimir resultado
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias você trabalhou esse mês: ");
        int dias = scanner.nextInt();
        scanner.close();

        float diasTotal = 25 * 8;
        System.out.println("Total a receber R$" + (diasTotal * dias));
    }
}
