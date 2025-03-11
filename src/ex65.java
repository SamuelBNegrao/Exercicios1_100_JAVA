/*
*****65*****
Desenvolva um programa usando a estrutura “para” que mostre na tela a seguinte contagem:
100 90 80 70 60 50 40 30 20 10 0 Acabou!
 */
import javax.swing.JOptionPane;
public class ex65 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar a condição "for" criando uma variavel com valor de 100
                2 - A cada interação imprimir o valor decrementado
                3 - Quando a variável chegar na condição de parada, 0, imprime acabou
                """.stripIndent());

        for ( int i = 100; i > -10; i-=10 ) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
    }
}
