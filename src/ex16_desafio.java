/*
*****16*****
[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados
por dias e quantos anos ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro.
Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
 */
import javax.swing.JOptionPane;
public class ex16_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Obter a quantidade de cigarros fumados por dia e por quantos anos o usuário é fumante\n" +
                "2 - Multiplicar a quantidade de cigarros por dia por 10 para obter a minutagem por dia\n" +
                "3 - Multiplicar a minutagem diária por 365 e o resultado disso multiplicar pela quantidade de anos sendo fumante para obter o tempo total\n" +
                "4 - Dividir o tempo total pela quantidade de minutos em um dia para obter o tempo em dias");

        String cigasStr = JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?");
        int cigas = Integer.parseInt(cigasStr);
        String anosStr = JOptionPane.showInputDialog("Você é um fumante há quantos anos?");
        int anos = Integer.parseInt(anosStr);

        int minutosPerdidosPorDia = cigas * 10;
        int totalMinutosPerdidos = minutosPerdidosPorDia * anos * 365;
        int diasPerdidos = totalMinutosPerdidos / (24 * 60);
        JOptionPane.showMessageDialog(null, "Tempo de vida perdido em dias: " + diasPerdidos);
    }
}