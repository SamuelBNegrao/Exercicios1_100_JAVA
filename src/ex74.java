/*
*****74****
Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico
com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9
 */

import javax.swing.*;
import java.util.ArrayList;

public class ex74 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Fazer uma variável  com valor 5
                2 - Fazer um loop com 10 repetições
                3 - A cada interaçõa do loop ele realiza uma comparação
                4 - Se for 5decrementa 2 da variavel e adiciona ao vetor. Caso contrário incrementa 2 novamente, adicionando ao vetor
                """.stripIndent());

        int num = 5;
        ArrayList<Integer> lista = new ArrayList <> ();

        for (int i = 0; i < 10; i++) {
            if (num == 5) {
                lista.add(num);
                num -= 2;
            }else {
                lista.add(num);
                num += 2;
            }
        }
        JOptionPane.showMessageDialog(null, "A lista é: " + "\n" + lista);

    }
}
