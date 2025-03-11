/*
*****12*****
Crie um programa em Java que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex12 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicite o preço de um produto para o usuário
                2 - Multiplique o preço por 0.05 para obter 5% do valor
                3 - Subtrair esse valor do preço passado e imprima 
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        float produto = scanner.nextFloat();
        scanner.close();

        double desconto = (produto * 0.05);

        System.out.println("O valor do produto com desconto de 5% é de: " + (produto - desconto));




    }
}
