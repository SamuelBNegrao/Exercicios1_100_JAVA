/*
*****05*****
Faça um programa em Java que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um Loop While
                2 - Enquanto o usuário não digitar um número inteiro o loop soma os números digitados numa variável
                3 - Quando o loop terminar, imprime a soma dividida pela quantidade de números digitados                
                """.stripIndent());
        int numero;
        int cont = 0;
        int soma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com um número positivo, um número negativo encerra a operação.");
        while ((numero = in.nextInt()) >= 0) {
            soma += numero;
            cont++;
        }
        in.close();
        int media = soma/cont;
        System.out.println("\nA média dos numeros digitasoe é de: " + media + "\nForam digitados "+ cont + " números.");
    }
}
