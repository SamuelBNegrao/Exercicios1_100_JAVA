/*
*****43*****
Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, marcando os números que forem divisíveis por 4,
exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
 */
import javax.swing.*;
public class ex43 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for para cada fez que o loop for executado a variável decrementa 1
                2 - Se o resto da divisão do número fo 0, imprime ele de forma destacada
                """.stripIndent());

        for (int i = 30; i > 0; i-=1) {
            if (i % 4 == 0){
                JOptionPane.showMessageDialog(null, "["+ i +"]");
            }else{
                JOptionPane.showMessageDialog(null, i);
            }
        }
    }
}
