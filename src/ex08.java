/*
*****08*****
Desenvolva um programa em Java que leia uma distância em metros e mostre os valores relativos em outras medidas.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar que o usuário digite um valor inteiro equivalente a uma distância em metros
                2 - Dividir esse número por mil, mostrando esse valor em KM
                3 - imprimir na tela 
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma medida em metros: ");
        float num = scanner.nextFloat();

        float km = num / 1000;
        scanner.close();

        System.out.println(("Você digitou "+ num + " metros"));
        System.out.println((num + " metros, são " + km + " km"));
    }
}