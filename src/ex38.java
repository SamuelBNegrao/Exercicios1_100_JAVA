/*
*****38*****
Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!
 */
import javax.swing.JOptionPane;
public class ex38 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Utilizar um loop for para cada fez que o loop for executado a variavel aumenta 1 
        2 - Quando o loop terminar, imprimir Acabou
        """.stripIndent());

        for(int i = 6 ; i < 12 ; i++){
            JOptionPane.showMessageDialog(null, i);
        }
        JOptionPane.showMessageDialog(null, "Acabou!");
    }
}
