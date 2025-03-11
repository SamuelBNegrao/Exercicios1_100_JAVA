/*
*****13*****
Faça um programa em Java que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex13 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicite o salário do usuário
                2 - Multiplicar esse valor por 0.15 para obter a porcentagem desejada
                3 - Somar o resultado com o salário original 
                4 - Imprimir resultado
                """.stripIndent());
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        float sal = salario.nextFloat();
        salario.close();

        double aumento = sal * 0.15;
        System.out.println("Aumento: " + (sal + aumento));
    }
}
