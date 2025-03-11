/*
*****06*****
Faça um programa em Java que leia um número inteiro e mostre o seu antecessor e seu sucessor.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar um número inteiro do usuário
                2 - Adicionar esse número a uma variável
                3 - Criar duas variáveis, uma decrementando 1 e outra incrementando 1
                4 - Imprimir ambos
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número inteiro: ");
        int numero = scanner.nextInt();// Lê o número digitado

        int antecessor = numero - 1;
        int sucessor = numero + 1;
        scanner.close();

        System.out.println(("O antecessor do número é " + antecessor + " e seu sucessor é " + sucessor));
    }
}
