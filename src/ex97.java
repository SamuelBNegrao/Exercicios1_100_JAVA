/*
*****97****
Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma adaptação que vai receber TRÊS números como parâmetro
e vai retornar qual foi o maior entre eles.
 */
import javax.swing.JOptionPane;
public class ex97 {
    static int maior(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > a && b > c) {
            return b;
        }else{
            return c;
        }

    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar trÊs números inteiros do usuário
                2- Passá-las como parâmetros para a função Maior que fará a comparação entre eles
                3 - Imprirmir o númeor maior, caso sejam iguais, imprimir outra mensagem
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número para comparar: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para comparar: "));
        int num3 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para comparar: "));
        JOptionPane.showMessageDialog(null,"O maior número é: " +  maior(num1, num2, num3));

    }
}
