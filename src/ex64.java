/*
*****64*****
Desenvolva um programa usando a estrutura “para” que mostre na tela a seguinte contagem:
0 5 10 15 20 25 30 35 40 Acabou!
 */
import javax.swing.*;
public class ex64 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar a condição "for" criando uma variavel com valor de 5
                2 - A cada interação imprimiri o valor interado
                3 - Quando a variável chegar na consição de parada, 40, imprime acabou
                """.stripIndent());

        for(int i=0; i != 45; i += 5){
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
    }
}
