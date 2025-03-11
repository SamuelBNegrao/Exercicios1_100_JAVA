/*
*****87****
Crie um programa que melhore o procedimento Gerador() da questão anterior para que mostre uma mensagem personalizada,
passada como parâmetro. Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+ ======= +
Aprendendo Portugol
+ ======= +
 */
import javax.swing.JOptionPane;
public class ex87 {
    static void gerador(String mensagem) {
        System.out.println("+ ======= +\n" + mensagem +"\n" + "+ ======= +");
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um procedimento que imprime na tela uma mensagem sem retorno
                2- A mensagem deve ser passada como parametro pelo usuário
                """);

        gerador("Aprendendo Portugol");
    }
}