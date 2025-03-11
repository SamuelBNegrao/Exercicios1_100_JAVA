/*
*****40*****
Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
 */
import javax.swing.*;
public class ex40 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for para cada fez que o loop for executado a variavel aumenta 3
                2 - Quando o loop terminar, imprimir Acabou
                """.stripIndent());

        for (int i = 0; i < 19; i+=3) {
            JOptionPane.showMessageDialog(null, i);
        }
        JOptionPane.showMessageDialog(null, "Acabou!");
    }
}
