/*
*****28*****
Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m².
O programa também deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
• Abaixo de 100m² = TERRENO POPULAR
• Entre 100m² e 500m² = TERRENO MASTER
• Acima de 500m² = TERRENO VIP
 */
import javax.swing.*;
public class ex28 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicitar do usuário o valor do comprimento e largura do terreno\n" +
                "2 - Fazer a multiplicação desses valores para obter os metros quadrados\n" +
                "3 - Se o resultado for menor que 100 imprimir POPULAR\n" +
                "4 - Se o resultado for entre 100 e 500 imprimir TERRENO MASTER \n" +
                "5 - Caso a for acima de 500, imprimir TERRENO VIP");

        try {
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do terreno: "));
            float largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura do terreno: "));
            double metros = altura * largura;
            if (altura < 0 || largura < 0) {
                throw new IllegalArgumentException("Valor não pode ser negativo!");
            }
            if (metros < 100) {
                JOptionPane.showMessageDialog(null, "TERRENO POPULAR\n"+
                                                                            metros + "m²");
            }else if(metros >= 100 && metros <= 500) {
                JOptionPane.showMessageDialog(null, "TERRENO MASTER\n"+
                        metros + "m²");
            }else{
                JOptionPane.showMessageDialog(null, "TERRENO VIP\n"+
                        metros + "m²");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor não pode ser negativo!");
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());


        }
    }
}
