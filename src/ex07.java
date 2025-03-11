/*
*****07*****
Crie um programa em Java que leia um número real e mostre na tela o seu dobro e a sua terça parte.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar do usuário um número inteiro
                2 - Criar duas variáveis, uma multiplicando esse número por 2 e outra dividindo por 3
                3 - Imprimir ambos
                """.stripIndent());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número inteiro: ");
        int num = scanner.nextInt();
        int dobro = num * 2;
        int terca = num / 3;
        System.out.println(("O dobro do número é " + dobro + " e sua terça parte é " + terca));
    }
}
