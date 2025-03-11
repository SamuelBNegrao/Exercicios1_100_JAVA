/*
*****46*****
Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
 */
import javax.swing.*;
public class ex46 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for para cada fez que o loop for executado a variavel incrementa 2 a partir de 6
                2 - A cada interação do loop somar i a uma variavel da soma TOtal
                3 - Ao final do loop imprime na tela a soma de todos os numeros até 100
                """.stripIndent());
        int soma = 0;
        for (int i = 6; i <= 100; i+=2) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null,"O resultado da soma: 6 + 8 + 10 + 12 + 14 + ... + 98 + 100 é: \n" + soma);
    }
}