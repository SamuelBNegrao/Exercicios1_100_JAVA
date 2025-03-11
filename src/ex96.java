/*
*****96****
Crie um programa que tenha uma função Media(), que vai receber as 2 notas de um aluno e retornar a sua média para o programa
principal.
 */
import javax.swing.JOptionPane;
public class ex96 {
    static int media(int a, int b){
        return (a+b)/2;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar dois números inteiros do usuário
                2- Passá-las como parâmetros para a função meida que somará ambas e dividirá por 2, retornando o valor
                3 - Imprimir o resultado
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número para somar: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para somar: "));

        JOptionPane.showMessageDialog(null,"A média das notas é: "+  media(num1, num2));

    }
}
