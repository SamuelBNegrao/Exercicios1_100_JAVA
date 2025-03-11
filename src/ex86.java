/*
*****86****
Crie um programa que tenha um procedimento Gerador() que, quando chamado, mostre a mensagem &quot;Olá, Mundo!&quot; com algum
componente visual (linhas) Ex: Ao chamar Gerador() aparece:
+ ======= +
Olá, Mundo!
+ ======= +
 */
import javax.swing.JOptionPane;
public class ex86 {
    static void gerador(){
        System.out.println("+ ======= +\n" +
                           "Olá, Mundo!\n" +
                           "+ ======= +");
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um procedimento que imprime na tela uma mensagem sem retorno
                """);
        gerador();
    }
}
