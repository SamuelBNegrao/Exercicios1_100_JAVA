/*
*****54*****
Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
• Qual foi a média de altura do grupo
• Quantas pessoas pesam mais de 90Kg
• Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
• Quantas pessoas que medem mais de 1.90m pesam mais de
100Kg.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ex54 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar um loop que repete 7 vezes perguntando o peso e a altura de 7 pessoas, armazenando os resultados em listas.
                2 - Somar as 7 alturas e dividir por 7 para calcular a média.
                3 - Contar quantas pessoas pesam mais de 90 kg.
                4 - Contar quantas pessoas pesam menos de 50 kg e têm menos de 1.60 m.
                5 - Contar quantas pessoas medem mais de 1.90 m e pesam mais de 100 kg.
                """.stripIndent());

        List<Float> pesos = new ArrayList<>();
        List<Float> alturas = new ArrayList<>();

        float somaAlturas = 0;
        int pessoas90kg = 0;
        int pessoasCaso2 = 0;
        int pessoasCaso3 = 0;

        for (int i = 0; i < 7; i++) {
            float peso = Float.parseFloat(JOptionPane.showInputDialog((i+1) + "º\n" + "Digite o seu peso (kg): "));
            float altura = Float.parseFloat(JOptionPane.showInputDialog((i+1) + "º\n" + "Digite sua altura (m): "));

            pesos.add(peso);
            alturas.add(altura);

            somaAlturas += altura;
            if (peso > 90) {
                pessoas90kg++;
            }
            if (peso < 50 && altura < 1.60) {
                pessoasCaso2++;
            }
            if (peso > 100 && altura > 1.90) {
                pessoasCaso3++;
            }
        }

        JOptionPane.showMessageDialog(null, "A média de altura do grupo é de: " + (somaAlturas / 7) + " m\n" +
                pessoas90kg + " pessoas pesam mais de 90kg.\n" +
                pessoasCaso2 + " pessoas pesam menos de 50kg e têm menos de 1.60m.\n" +
                pessoasCaso3 + " pessoas pesam mais de 100kg e medem mais de 1.90m.");
    }
}
