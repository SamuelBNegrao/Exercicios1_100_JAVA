/*
*****47*****
Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
 */
import javax.swing.*;
public class ex47 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for, para cada fez que o loop for executado a variável decrementa 50 a partir de 500
                2 - A cada interação do loop somar i a uma variável da soma Total
                3 - Ao final do loop imprime na tela a soma de todos os números
                """.stripIndent());
        int soma = 0;
        for (int i = 500; i >= 0; i-=50) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null,"O resultado da soma: 500 + 450 + 400 + 350 + 300 + ... + 50 + 0 é: \n" + soma);
    }
}