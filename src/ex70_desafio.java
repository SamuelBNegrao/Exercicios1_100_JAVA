/*
*****70****
[DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência de Fibonacci:
1 1 2 3 5 8 13 21...
 */

import javax.swing.JOptionPane;
public class ex70_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar 3 variáveis sendo que A e B iniciarão com o valor de 1 e outra que será a soma entre elas
                2 - Gerar um loop que repetirá 10 vezes
                3 - A cada interação imprimir a variável A e atribuir o valor de B a A
                4 - Atribuir o valor da soma de ambos a B
                5 - Imprimir a lista
                """.stripIndent());
        int a = 1, b = 1, n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int fib = a + b;
            a = b;
            b = fib;
        }
    }
}

