/*
*****17*****
Escreva um programa que pergunte a velocidade de um carro.
Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa,
cobrando R$5 por cada Km acima da velocidade permitida.
 */

import javax.swing.*;
public class ex17 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Perguntar ao usuário a velocidade do carro\n" +
                "2 - Se o valor passado for menor que 80, imprima uma mensagem\n" +
                "3 - Caso for maior que 80, imprima uma mensagem que o usuário foi multado\n" +
                "4 - Subtrair 80 do valor obtido, o restante multiplicar por 5, sendo o valor a ser cobrado na multa");

        String velocidadeStr = JOptionPane.showInputDialog("Qual era a velocidade do carro?");
        int velocidade = Integer.parseInt(velocidadeStr);
        if(velocidade < 80){
            JOptionPane.showMessageDialog(null, "Legal! Dirija com responsabilidade!");
        }else{
            int multa = (velocidade - 80) * 5;
            JOptionPane.showMessageDialog(null, "Você ultrapassou o limite de velocidade!\n" +
                                                                        "Sua multa é de R$" + multa);
        }
    }
}
