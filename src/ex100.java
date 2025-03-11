/*
*****100****
Melhore o exercício 96, criando além da função Media() uma outra função chamada Situacao(), que vai retornar para o programa
principal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO.
Essa nova função, vai receber como parâmetro o resultado retornado pela função Media().
 */
import javax.swing.JOptionPane;
public class ex100 {
    static int media(int a, int b) {
        return (a + b) / 2;
    }
    static String situacao(int num) {
        if (num < 4) {
            return "REPROVADO";
        }else if (num >= 4 && num < 7) {
            return "RECUPERAÇÃO";
        }else{
            return "APROVADO!";
        }
    }


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                 1 - Solicitar dois números inteiros do usuário
                 2- Passá-las como parâmetros para a função media que somará ambas e dividirá por 2, retornando o valor
                 3 - Criar outra função chamada SITUAÇÃO, onde ela recebe o retorno da primeira função mostrando se o aluno está aprovado
                 4 - IMprimiri o retorno 
                """);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outra nota: "));

        JOptionPane.showMessageDialog(null, "A média das notas é: " + media(num1, num2));
        JOptionPane.showMessageDialog(null, "Situação do aluno: " + situacao(media(num1, num2)));
    }
}
