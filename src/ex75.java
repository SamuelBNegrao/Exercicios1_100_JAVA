/*
*****75****
Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico
com 15 posições com os primeiros elementos da sequência de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5  6  7  8  9  10  11  12 13  14  15
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ex75 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar 3 variáveis sendo A e B inciarão com o valor de 1 e outra que será a soma entre elas
                2 - Gerar um loop que repetirá 15 vezes
                3 - A cada interação adicionar a variavel A  na lista e atribuir o valor de B a A
                4 - Atribuir o valor da soma de ambos a B
                5 - Imprimir lista
                
                """.stripIndent());
        ArrayList <Integer> lista = new ArrayList <> ();
        int a = 1, b = 1, n = 16;
        for(int i = 0; i < n; i++){
            lista.add(a);
            int fib = a + b;
            a = b;
            b = fib;
        }
        JOptionPane.showMessageDialog(null, "A sequencia de 15 números seguindo FIbonacci é: \n" + lista);
    }
}
