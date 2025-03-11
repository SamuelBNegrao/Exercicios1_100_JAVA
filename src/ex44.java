/*
*****44*****
Crie um algoritmo que leia o valor inicial da contagem, o valor final e o incremento, mostrando em seguida todos os
valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
 */
import javax.swing.JOptionPane;
public class ex44 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Pedir ao usuário para digitar um número de inicio e fim
                2 - Solicitar o calor de incremento
                3 - Utilizar um loop para a contagem, e se o valor for menor ou igual ao valor final, imprimir acabou!
                """.stripIndent());


        int numInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo inicial: "));
        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo final: "));
        int numCont = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de incremento: "));

        for (; numInicio<=numFinal; numInicio += numCont) {
            JOptionPane.showMessageDialog(null, numInicio);
        }
        JOptionPane.showMessageDialog(null, "Acabou!");
    }
}
