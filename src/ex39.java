/*
*****39*****
Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
 */

import javax.swing.*;
public class ex39 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for para cada fez que o loop for executado a variavel decrementa 1 
                2 - Quando o loop terminar, imprimir Acabou
                """.stripIndent());

        for (int i = 10; i > 2; i--) {
            JOptionPane.showMessageDialog(null, i);
        }
        JOptionPane.showMessageDialog(null, "Acabou!");
    }
}
