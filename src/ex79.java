/*
*****79****
Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. No final, mostre quais são os números pares que foram
digitados e em que posições eles estão armazenados.
 */

import javax.swing.*;
import java.util.ArrayList;
public class ex79 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 10 repetições e solicitar que o usuário digite 10 numeros inteiros, adicionando-os em um vetor
                2 - Criar uma lista de tamanho 10
                3 - Gerar uma comparação para cada numero digitado
                4 - Para cada número que o usuário digitar dividir por 2 e verificar se o resto é zero, se for zero, retornar 1 
                5 - Adicionar par a lista nova e imprimir ambas
                """.stripIndent());

        ArrayList <Integer> lista = new ArrayList<>();
        ArrayList <String> listapar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            lista.add(num);
            if (num % 2 == 0) {
                listapar.add(num + "é par");
            }
        }
        JOptionPane.showMessageDialog(null,  "Lista: " + lista +"\n" +
                "Pares: " +listapar + "\n");
    }
}
