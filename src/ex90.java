/*
*****90****
Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses valores para um procedimento Somador() que vai
calcular e mostrar a soma entre eles.
 */
import javax.swing.*;
public class ex90 {
    static void somador(int a, int b){
        int soma = a+b;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);

    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar dois números inteiros do usuário
                2- Passá-las como parâmetros para o procedimento somador que somará ambas e imprimir na tela
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número para somar: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para somar: "));
        somador(num1, num2);
    }
}
