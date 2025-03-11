/*
*****20*****
Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.
 */
import javax.swing.JOptionPane;
public class ex20 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Pergunte um número para o usuário\n" +
                "2 - Divida esse número por 2 e veja se tem resto\n" +
                "3 - Se não houver resto, imprima PAR\n"+
                "4 - Caso contrário, imprima ÍMPAR");

        String numStrg = JOptionPane.showInputDialog("Digite um número: ");
        int num = Integer.parseInt(numStrg);
        int resto = num % 2;

        if (resto == 0) {
            JOptionPane.showMessageDialog(null, "O número é par!");
        }else{
            JOptionPane.showMessageDialog(null,"O número é ímpar!");
        }
    }
}
