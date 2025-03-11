/*
*****41*****
Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
 */
import javax.swing.*;
public class ex41 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for para cada fez que o loop for executado a variavel decrementa 5
                2 - Quando o loop terminar, imprimir Acabou
                """.stripIndent());

        for (int i = 100; i > -1; i-=5) {
            JOptionPane.showMessageDialog(null, i);
        }
        JOptionPane.showMessageDialog(null, "Acabou!");
    }
}