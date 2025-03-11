/*
*****36*****
Um programa de vida saudável quer dar pontos atividades físicas que possam ser trocados por dinheiro. O sistema funciona assim:
• Cada hora de atividade física no mês vale pontos
•   até 10h de atividade no mês: ganha 2 pontos por hora
•   de 10h até 20h de atividade no mês: ganha 5 pontos por hora
•   acima de 20h de atividade no mês: ganha 10 pontos por hora
• A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos ela teve e quanto dinheiro
ela conseguiu ganhar.
 */
import javax.swing.JOptionPane;
public class ex36 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Perguntar ao usuário quantas horas ele teve de atividade por mês
        2 - multiplicar 0,05 pela quantidade de pontos obtida em um mês
        3 - Multiplicar esse resultado por 12 e imprimir ao usuário a quantidade em dinheiro
        """.stripIndent());

        int horas = Integer.parseInt((JOptionPane.showInputDialog("Quantas horas você fez de exercício por mês?")));
        if (horas < 10) {
            float pontos = horas * 2;
            float mes = (pontos * 12);
            double money = mes * 0.05;
            JOptionPane.showMessageDialog(null, "Durante esse ano você faturou R$" + money);
        }else if(horas >= 10 && horas <= 20){
            float pontos = horas * 5;
            float mes = (pontos * 12);
            double money = mes * 0.05;
            JOptionPane.showMessageDialog(null, "Durante esse ano você faturou R$" + money);
        }else{
            float pontos = horas * 10;
            float mes = (pontos * 12);
            double money = mes * 0.05;
            JOptionPane.showMessageDialog(null, "Durante esse ano você faturou R$" + money);
        }

    }
}
