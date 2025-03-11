/*
*****93****
Faça um programa que tenha um procedimento chamado Contador() que recebe três valores como parâmetro: o início, o fim e o
incremento de uma contagem. O programa principal deve solicitar a digitação desses valores e passá-los ao procedimento, que vai
mostrar a contagem na tela.
Para os valores de início (4), fim (20) e incremento(3) teremos Contador(4, 20, 3) vai mostrar na tela
4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
 */
import javax.swing.*;
public class ex93 {
    static void contador(int n, int m, int i){
        while(n <= m){
            System.out.print(n + " >> ");
            n += i;
        }
        System.out.print(" FIM ");
    }


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar 3 números inteiros, inicio, fim e incremento
                2 - Passar esses núemros ocmo parâmetros para o procedimento Contador
                3 - O procedimento irá adicionar o incremento no inicio até q se iguale ao fim
                """);

        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial: "));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final: "));
        int inc = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de incremento: "));

        contador(inicio, fim, inc);
    }
}
