/*
*****91****
Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses valores para um procedimento Maior() que vai
verificar qual deles é o maior e mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem informando essa
característica.
 */
import  javax.swing.JOptionPane;
public class ex91 {
    static void maior(int a, int b){
        if(a > b){
            JOptionPane.showMessageDialog(null, "O maior número é: " + a);
        } else if (a < b) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + b);
        }else{
            JOptionPane.showMessageDialog(null, "Ambos os números são iguais!");
        }


    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar dois números inteiros do usuário
                2- Passá-las como parâmetros para o procedimento Maior que fará a comparação entre eles
                3 - Imprirmir o númeor maior, caso sejam iguais, imprimir outra mensagem
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número para comparar: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para comparar: "));
        maior(num1, num2);
    }
}