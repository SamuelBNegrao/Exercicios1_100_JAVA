/*
*****67*****
Faça um programa usando a estrutura “para” que leia um número inteiro positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
 */
import javax.swing.JOptionPane;
public class ex67 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar um número do  usuário
                2 - Utilizar um loop for para realizar o incremento de variável e somar até o número, sendo ele a condição de parada
                3 - Imprimir o resultado
                """.stripIndent());

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um nímero para a contagem: "));
        for (int i = 0; i < (num+1); i++) {
            System.out.print(i + ", ");
        }
        System.out.print("FIM!");
    }
}
