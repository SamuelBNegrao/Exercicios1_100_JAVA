/*
*****48*****
Faça um programa que leia 7 números inteiros e no final mostre o somatório entre eles.
 */
import javax.swing.JOptionPane;
public class ex48 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Pedir para o usuário inserir 7 números inteiros
                2 - Utilizar um loop While com uma variável contadora até 7
                3 - Armazenar os números que o usuário digitar em uma variável somaTotal, que imprimira a soma de todos 
                """.stripIndent());
        int i = 1;
        int qtdVezes = 7;
        int soma = 0;
        while(i < 8){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para realizar a somatória: \n" +
                    "Faltam mais "+ qtdVezes + " números."));
            soma += num;
            qtdVezes-=1;
            i+= 1;
        }
        JOptionPane.showMessageDialog(null,"O resultado da soma dos números digitados é: " + soma);
    }
}
