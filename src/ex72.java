/*
*****72****
Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico
com 10 posições, conforme abaixo:
5 10 15 20 25 30 35 40 45 50
0  1  2  3  4  5  6  7  8  9
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ex72 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Fazer uma variável  com valor 5
                2 - Fazer um loop com 10 repetições
                3 - GErar um loop onde a cada interação a variavel é incrementada em 5 e adicionada ao vetor
                """.stripIndent());

        int num = 5;
        ArrayList <Integer> numArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numArray.add(num);
            num += 5;
        }
        JOptionPane.showMessageDialog(null, "O vetor é: " + "\n" +
                numArray);
    }
}
