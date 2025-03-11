/*
*****50*****
Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
• Quais foram os números sorteados
• Quantos números estão acima de 5
• Quantos números são divisíveis por 3
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
public class ex50 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop onde o computador deve escolher 6 números entre 0 e 10 aleatóriamente.
                2 - Após os sorteio, imprimir na tela quais números foram sorteados
                3 - Imprimir quantos são maiores que 5
                4 - Imprimir quantos são divisiveis por 3
                """.stripIndent());
        List<Integer> numerosAleatorios = new ArrayList<>();
        int numMaior = 0;
        int divPor3 = 0;

        for (int i = 0; i < 20; i++) {
            Random computador = new Random();
            int escolhaComputador = computador.nextInt(11);
            numerosAleatorios.add(escolhaComputador);
            if (escolhaComputador > 5 && escolhaComputador % 3 == 0) {
                numMaior += 1;
                divPor3 += 1;
            } else if (escolhaComputador % 3 == 0 && escolhaComputador != 0){
                divPor3 += 1;
            } else if (escolhaComputador > 5) {
                numMaior += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "O computador escolheu esses números:\n" + numerosAleatorios + "\n"+
                                                        numMaior +" deles são maiores que cinco\n" + divPor3 +" deles são divisíveis por três." );



    }
}
