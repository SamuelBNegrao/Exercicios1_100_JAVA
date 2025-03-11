/*
*****71****
Faça um programa que preencha automaticamente um vetor numérico com 8 posições, conforme abaixo:
999 999 999 999 999 999 999 999
0    1   2   3   4   5   6   7
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ex71 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                2 - SOlicitar o número para preencher o vetor
                3 - Gerar um loop que percorre cada posição do vetor inserindo o segundo numero digitado 
                """.stripIndent());

            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para preencher o vetor: "));
            ArrayList<Integer> vetor = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                vetor.add(num);
            }
            JOptionPane.showMessageDialog(null, "O vetor digitado: " +
                    vetor);


    }
}
