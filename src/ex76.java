/*
*****76****
Crie um programa que preencha automaticamente um vetor numérico com 7 números gerados aleatoriamente pelo
computador e depois mostre os valores gerados na tela.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
public class ex76 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Pedir para o cuppoutar escolher 7 números de 0 a 100 aleatóriamente em um loop
                2 - Após a escolha, adicionar esses números a uma lista
                3 - Imprimir lista
                """.stripIndent());

        ArrayList <Integer> lista = new ArrayList <> ();
        for (int i = 0; i < 7; i++) {   Random aleatorio = new Random();
            int num = aleatorio.nextInt(100);
            lista.add(num);
        }
     JOptionPane.showMessageDialog(null, "A lista com números aleatórios: \n" + lista);
    }

}
