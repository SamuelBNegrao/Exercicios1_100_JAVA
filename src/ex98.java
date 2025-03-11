/*
*****98****
Crie um programa que tenha uma função SuperSomador(), que vai receber dois números como parâmetro e depois vai retornar a soma
de todos os valores no intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
 */

import javax.swing.JOptionPane;
public class ex98 {
    static int superSomador(int n, int m){
        int soma = 0;
        for (int i = n; i <= m; i++){
            soma += i;
        }
        return soma;
    }


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar 2 números inteiros do usuário
                2- Passá-las como parâmetros para a função super somador
                3 - Criar um Loop onde um contador interável percorre todos os números de n até m
                4 - Retornar resultado e imprimir
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o número final: "));
        JOptionPane.showMessageDialog(null,"Super soma é : " +  superSomador(num1, num2));
    }
}
