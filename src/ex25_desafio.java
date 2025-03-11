/*
*****25*****
[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.
 */

import javax.swing.JOptionPane;
public class ex25_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicite do usuário 3 números para serem os segmentos do triângulo\n" +
                "2 - Fazer a comparação entre a soma dos pontos, somando dois lados e verificando com o lado restante \n" +
                "3 - Se todos os lados forem menores que a soma dos seus lados opostos é possível criar um triângulo\n" +
                "4 - Caso contrário, se algum lado for maior que a soma de um dos outros lados, não é possível fazer o triângulo\n");

        try {
            String ladoAStrg = JOptionPane.showInputDialog("Digite o primeiro valor do triângulo: ");
            float ladoA = Float.parseFloat(ladoAStrg);
            String ladoBStrg = JOptionPane.showInputDialog("Digite o segundo valor do triângulo: ");
            float ladoB = Float.parseFloat(ladoBStrg);
            String ladoCStrg = JOptionPane.showInputDialog("Digite o terceiro valor do triângulo: ");
            float ladoC = Float.parseFloat(ladoCStrg);

            if(ladoA < 0 || ladoB < 0|| ladoC < 0){
                throw new IllegalArgumentException("Valor não pode ser negativo!");
            }
            if(ladoA < (ladoB + ladoC) && ladoB < (ladoC + ladoA) && ladoC < (ladoA + ladoB)){
                JOptionPane.showMessageDialog(null, "Legal! É possível criar um triângulo com essas medidas!!!");
            }else{
                JOptionPane.showMessageDialog(null, "Não é possível criar um triângulo com essas medidas...\n" +
                                                                            "Tente outras medidas na próxima vez.");
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor não pode ser negativo!");
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
