/*
*****10*****
Faça um programa em Java que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada
e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar do usuário a altura e a largura da parede
                2 - Multiplicar a altura pela largura, resultando em metros quadrados
                3 - Dividir a área por 2, resutlando na quantidade de latas de tinta necessárias
                4 - Imprimiri ambos
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sigite a largura da parede: ");
        float largura = scanner.nextFloat();
        System.out.println("Sigite a altura da parede: ");
        float altura = scanner.nextFloat();
        scanner.close();

        double area = largura * altura;

        System.out.println("A área da parede é de " + area + " m^2");
        System.out.println("Para pintar a parede você vai precisar de " + (area /2) + "latas de tinta.");

    }
}
