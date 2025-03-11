/*
*****19*****
Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela.
No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).
 */
import javax.swing.*;
public class ex19 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Perguntar o nome do aluno e suas duas notas\n" +
                "2 - Somar as duas notas e dividir por dois\n" +
                "3 - Se a nota for acima de 7, imprima uma mensagem positiva\n" +
                "4 - Caso for menor, imprima uma mensagem que o aluno foi reprovado");

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        String nota1Strg = JOptionPane.showInputDialog("Digita a primeira nota: ");
        String nota2Strg = JOptionPane.showInputDialog("Digite a segunda nota: ");
        int nota1 = Integer.parseInt(nota1Strg);
        int nota2 = Integer.parseInt(nota2Strg);
        int media = (nota1 + nota2) / 2;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi aprovado com sucesso!\n" +
                    "Sua média foi: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi reprovado...\n" +
                    "Sua média foi: " + media);

        }
    }
}