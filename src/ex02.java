/*
*****02*****
Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela
 */
import javax.swing.*;
public class ex02 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Pedir ao usuário seu nome\n" +
                "2 - Imprimir na tela uma mensagem de boas-vindas com o nome inserido");
        String nome = JOptionPane.showInputDialog("Digite seu nome.");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");

    }
}
