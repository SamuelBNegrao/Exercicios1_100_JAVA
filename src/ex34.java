/*
*****34*****
O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no peso de uma pessoa.
* De acordo com o valor do IMC, podemos classificar o indivíduo dentro de certas faixas.
• abaixo de 18.5: Abaixo do peso
• entre 18.5 e 25: Peso ideal
• entre 25 e 30: Sobrepeso
• entre 30 e 40: Obesidade
• acima de 40: Obesidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido
pelo quadrado da altura)
 */
import javax.swing.*;
public class ex34 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Perguntar ao usuário seu peso e sua altura
        2 - Dividir o peso pelo quadrado da altura
        3 - Dependendo do resultado imprimir o a categoria que o pessoa se encontra
        """.stripIndent());

        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
        double imc = peso / (altura * altura);
        String imcformatado = String.format("%.2f", imc);

        if(imc < 18.5){
            JOptionPane.showMessageDialog(null, "Seu valor de IMC é de  " + imcformatado + "\n" + "Está abaixo do peso!");
        }else if(imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, "Seu valor de IMC é de  " + imcformatado + "\n" + "Está no peso ideal!");
        }else if(imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, "Seu valor de IMC é de  " + imcformatado + "\n" + "Está sobrepeso!");
        }else if(imc >= 30 && imc < 40){
            JOptionPane.showMessageDialog(null, "Seu valor de IMC é de  " + imcformatado + "\n" + "Está obeso!");
        }else if(imc > 40){
            JOptionPane.showMessageDialog(null, "Seu valor de IMC é de  " + imcformatado + "\n" + "Está com obesidade mórbida!");
        }
    }
}
