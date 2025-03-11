/*
*****51*****
Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ex51 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Fazer um loop onde o usuário digita 8 números
                2 - Cada número é adicionado a uma lista
                3 - Comparar os números para encontrar o maior e atribui-lo a uma variável
                4 - Exibir o valor final
                """.stripIndent());

        List<Integer> numeros = new ArrayList<>();


        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
            numeros.add(num);
        }
        int numMaior = numeros.get(0);


        // Percorrendo a lista para encontrar maior e menor
        for (int num : numeros) {
            if (num > numMaior) {
                numMaior = num;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número digitado é: " + numMaior);
    }
}
