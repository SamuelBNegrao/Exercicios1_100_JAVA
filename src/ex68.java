/*
*****68*****
Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura “para”. No final, mostre na tela:
• Quantas mulheres foram cadastradas
• Quantos homens pesam mais de 100Kg
• A média de peso entre as mulheres
• O maior peso entre os homens
 */
import javax.swing.JOptionPane;

public class ex68 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um loop for para que o usuário digite sexo e peso de 8 pessoas.
                2 - Contar a quantidade de mulheres cadastradas.
                3 - Contar quantos homens pesam mais de 100 kg.
                4 - Somar os pesos das mulheres para calcular a média.
                5 - Comparar os pesos dos homens e armazenar o maior valor.
                """.stripIndent());

        int peso100 = 0;
        int mulheres = 0;
        float maiorH = 0;
        double somaMulher = 0;
        String[] listaSexo = {"HOMEM", "MULHER"};

        for (int i = 0; i < 8; i++) { // Loop para 8 pessoas
            int escolhaSexo = JOptionPane.showOptionDialog(null, "Qual é seu sexo?", "Pesquisa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaSexo, listaSexo[0]);

            float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));

            if (escolhaSexo == 0) { // Se for HOMEM
                if (peso > 100) {
                    peso100++;
                }
                if (peso > maiorH) {
                    maiorH = peso; // Sempre atualiza o maior peso masculino
                }
            } else { // Se for MULHER
                mulheres++;
                somaMulher += peso;
            }
        }

        // Evita erro de divisão por zero
        double mediaMulheres = (mulheres > 0) ? (somaMulher / mulheres) : 0;

        JOptionPane.showMessageDialog(null, "Resultados:\n" +
                "• Total de mulheres cadastradas: " + mulheres + "\n" +
                "• Homens com mais de 100kg: " + peso100 + "\n" +
                "• Média de peso entre as mulheres: " + String.format("%.2f", mediaMulheres) + " kg\n" +
                "• Maior peso entre os homens: " + maiorH + " kg");
    }
}
