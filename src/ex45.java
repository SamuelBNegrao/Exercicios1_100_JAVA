/*
*****45*****
O programa acima vai ter um problema quando digitarmos o primeiro valor maior que o último. Resolva esse problema com um
código que funcione em qualquer situação.
 */
import javax.swing.JOptionPane;
public class ex45 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Pedir ao usuário para digitar um número de inicio e fim
                2 - Comparar qual dos dois números é maior e trocar a ordem caso o primeiro for maior que o segundo
                3 - Solicitar o calor de incremento
                4 - Utilizar um loop para a contagem, e se o valor for menor ou igual ao valor final, imprimir acabou!
                """.stripIndent());



        int numInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo inicial: "));
        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo final: "));
        int numCont = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de incremento: "));

        if(numFinal > numInicio) {
            for (; numInicio <= numFinal; numInicio += numCont) {
                JOptionPane.showMessageDialog(null, numInicio);
            }
            JOptionPane.showMessageDialog(null, "Acabou!");
        }else{
            for (; numFinal <= numInicio; numFinal += numCont) {
                JOptionPane.showMessageDialog(null, numFinal);
            }
            JOptionPane.showMessageDialog(null, "Acabou!");
        }
    }
}
