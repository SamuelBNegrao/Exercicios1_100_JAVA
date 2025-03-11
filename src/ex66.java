/*
*****66*****
Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...
 */
import javax.swing.JOptionPane;
public class ex66 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar do usuário um número para realizar a tabuada
                2- usar o loop for multiplicando um variavel interavel de 1 a 10 
                3 - Imprimir os 10 resultados ta tabuada 
                """.stripIndent());

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fazer a tabuada:"));
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
