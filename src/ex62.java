/*
*****62*****
Faça um programa usando a estrutura “faça enquanto” que leia a idade de várias pessoas. A cada laço, você deverá perguntar para o
usuário se ele quer ou não continuar a digitar dados. No final, quando o usuário decidir parar, mostre na tela:
• Quantas idades foram digitadas
• Qual é a média entre as idades digitadas
• Quantas pessoas tem 21 anos ou mais.
 */

import javax.swing.JOptionPane;
public class ex62 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um Loop do while pedindo para o usuario digitar idades
                2 - A cada interação perguntar se quer continuar
                3 - Cada interação do usuário afetará as avariáveis iterativas que contaram a quantidade de idades digitadas
                4 - SOmar todas as idades e dividir pela quantidade
                5 - Realizar uma comparação, imprimindo quantas idades tem 21 ou mais 
                """.stripIndent());

        boolean continuar = true;
        int quantidade = 0;
        int media = 0;
        int idades21 = 0;

        do{
            int idades = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade: "));
            quantidade += 1;
            media += idades;
            if(idades >= 21){
                idades21 += 1;
            }
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }while(continuar == true);

        JOptionPane.showMessageDialog(null,  "Quantidade de números digitadas:  " + quantidade + "\n" +
                "A média entre as idades é de:  " + (media / quantidade) + "\n" +
                "Quantidade de pessoas com 21 anos ou mais:  " + idades21);

    }
}
