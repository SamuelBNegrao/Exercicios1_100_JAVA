/*
*****25*****
Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
• O primeiro valor é o maior
• O segundo valor é o maior
• Não existe valor maior, os dois são iguais
 */
import javax.swing.JOptionPane;
public class ex26 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicitar do usuário 2 npumeros inteiros\n" +
                "2 - Fazer a comparação entre ambos os números\n" +
                "3 - Se o primeiro valor for maior, imprimir para o usuário uma mensagem\n" +
                "4 - Se o segundo valor for maior, imprimir para o usuário outra mensagem\n" +
                "5 - Caso ambos forem iguais, imprimir ao usuário uma mensagem");

        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro: "));

        if (valorA == valorB) {
            JOptionPane.showMessageDialog(null, "Não existe valor maior, os dois são iguais.");
        }else if(valorA > valorB){
            JOptionPane.showMessageDialog(null,"O primeiro valor é maior.");
        }else{
            JOptionPane.showMessageDialog(null, "O segundo valor é menor.");
        }
    }
}
