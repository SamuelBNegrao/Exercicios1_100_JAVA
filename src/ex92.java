/*
*****92****
Crie uma lógica que leia um número inteiro e passe para um procedimento ParOuImpar() que vai verificar e mostrar na tela
se o valor passado como parâmetro é PAR ou ÍMPAR.
 */
import javax.swing.JOptionPane;
public class ex92 {
    static void maior(int a){
        if(a % 2 == 0){
            JOptionPane.showMessageDialog(null, "O maior número é PAR");
        } else {
            JOptionPane.showMessageDialog(null, "O maior número é ÍMPAR");
        }


    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar um número inteiro
                2 - Passá-lo como parâmetro para o procedimento ParouImpar que divirá o númeoro por dois
                3 - Se o resto dad divisão for 0  imprime par caso contrário, impar
                """);
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se é PAR ou ÍMPAR: "));
        maior(num1);
    }
}

