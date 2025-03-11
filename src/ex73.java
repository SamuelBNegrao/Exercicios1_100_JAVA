/*
*****73****
Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico
com 10 posições, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ex73 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Fazer uma variável  com valor 9
                2 - Fazer um loop com 10 repetições
                3 - O loop a cada interação, a variavel é decrementada em 1 e adicionada ao vetor
                """.stripIndent());
        int num = 9;
        ArrayList <Integer> lista = new ArrayList <> ();

        for (int i = 0; i < 10; i++) {
            lista.add (num);
            num--;
        }
        JOptionPane.showMessageDialog(null, "A lista é: " + "\n" + lista);
    }
}
