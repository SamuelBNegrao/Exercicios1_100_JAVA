/*
*****03*****
Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
 */
import javax.swing.JOptionPane;
public class ex03 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Pedir ao usuário seu nome\n" +
                "2 - Pedir ao usuário seu salário\n" +
                "3 - Imprimir na tela uma mensagem com o nome e salário inseridos");
        String nome = JOptionPane.showInputDialog("Digite seu nome.");
        String salario = JOptionPane.showInputDialog("Digite seu salário.");
        JOptionPane.showMessageDialog(null,  nome + ", seu salário é de R$" + salario);
    }
}
