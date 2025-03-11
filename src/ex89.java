/*
*****89****
Crie um programa que melhore o procedimento Gerador() da questão anterior para que o programador possa escolher uma entre
três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador(&quot;Portugol Studio&quot;, 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol
Studio
Portugol
Studio
Portugol
Studio
~~~~~~~~:::::::~~~~~~~
 */
import javax.swing.*;
public class ex89 {
    static void gerador(String mensagem,int n, int j) {
        if (j == 1) {
            System.out.println("+ -------=======------ +");
        } else if (j == 2) {
            System.out.println("+ ~~~~~~~~:::::::~~~~~~~ +");
        } else {
            System.out.println("+ <<<<<<<<------->>>>>>> +");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mensagem);
        }
        if (j == 1) {
            System.out.println("+ -------=======------ +");
        } else if (j == 2) {
            System.out.println("+ ~~~~~~~~:::::::~~~~~~~ +");
        } else {
            System.out.println("+ <<<<<<<<------->>>>>>> +");
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um procedimento que imprime na tela uma mensagem sem retorno
                2- A mensagem deve ser passada como parametro pelo usuário
                """);
        gerador("Aprendendo\nPortugol", 3, 2);
    }

}
