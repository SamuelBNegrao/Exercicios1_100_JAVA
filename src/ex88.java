import javax.swing.*;

/*
*****88****
Crie um programa que melhore o procedimento Gerador() da questão anterior para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol";, 4) aparece:
+ ======= +
Aprendendo
Portugol
Aprendendo
Portugol
Aprendendo
Portugol
Aprendendo
Portugol
+ ======= +
 */
public class ex88 {
    static void gerador(String mensagem,int n) {
        System.out.println("+ ======= +");
        for(int i=0; i<n; i++) {
            System.out.println( mensagem );
        }
        System.out.println("+ ======= +");
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um procedimento que imprime na tela uma mensagem sem retorno
                2- A mensagem deve ser passada como parametro pelo usuário
                """);

        gerador("Aprendendo\nPortugol", 4);
    }
}

