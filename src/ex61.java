/*
*****61*****
Crie um programa que mostre na tela a seguinte contagem, usando a estrutura “faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */

import javax.swing.JOptionPane;
public class ex61 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar uma variável e atribuir o valor 3 a ela
                2 - Somar 3 em 3 a essa variavel enquanto ela for menor que 30
                3 - Ao chegar em 30, imprimir Acabou!
                """.stripIndent());
        int num = 3;
        do {
            System.out.print(num + " ");
            num +=3;
        } while (num <= 30);
        System.out.println("Acabou!");


    }
}
