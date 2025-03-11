/*
*****95****
Refaça o exercício 90, só que agora em forma de função Somador(), que vai receber dois parâmetros e vai retornar o
resultado da soma entre eles para o programa principal.
 */
import javax.swing.*;
public class ex95 {
    static int somador(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar dois números inteiros do usuário
                2- Passá-las como parâmetros para a função somador que somará ambas e retornar o valor
                3 - Imprimir o resultado
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número para somar: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para somar: "));

        JOptionPane.showMessageDialog(null,"A soma é: "+  somador(num1, num2));
    }
}
