/*
*****53*****
Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
• Quantos homens foram cadastrados
• Quantas mulheres foram cadastradas
• A média de idade do grupo
• A média de idade dos homens
• Quantas mulheres tem mais de 20 anos
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ex53 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Fazer um loop onde o usuário digita idade e sexo de 5 pessoas
                2 - Somar todas as idades e calcular a média geral
                3 - Contar quantos homens e mulheres foram cadastrados
                4 - Calcular a média de idade dos homens comparando indices entre uma lista de "sexos" e "idades"
                5 - COntar quantas mulheres existem no grupo, e comparar com os indices vendo quais idades são amiores que 20
                """.stripIndent());

        List<Integer> idades = new ArrayList<>();
        List<Integer> sexos = new ArrayList<>();

        int totalHomens = 0;
        int totalMulheres = 0;
        int somaIdades = 0;
        int somaIdadeHomens = 0;
        int qtdHomens = 0;
        int qtdMulheresMaisDe20 = 0;

        String[] listaSexo = {"HOMEM", "MULHER"};

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª idade:"));
            somaIdades += idade;
            idades.add(idade);

            int escolhaSexo = JOptionPane.showOptionDialog(null, "Qual é seu sexo?", "Pesquisa",
                    0, 3, null, listaSexo, listaSexo[0]);

            if (escolhaSexo == 0) { // Homem
                totalHomens++;
                somaIdadeHomens += idade; // Soma apenas idades de homens
                qtdHomens++;
                sexos.add(1);
            } else { // Mulher
                totalMulheres++;
                if (idade > 20) {
                    qtdMulheresMaisDe20++; // Conta mulheres com mais de 20 anos
                }
                sexos.add(2);
            }
        }

        // Cálculo da média de idade dos homens (evita divisão por zero)
        double mediaIdadeHomens = (qtdHomens > 0) ? (double) somaIdadeHomens / qtdHomens : 0;

        // Exibir os resultados
        JOptionPane.showMessageDialog(null, "Foram cadastrados: " + totalHomens + " homens.\n" +
                "Foram cadastradas: " + totalMulheres + " mulheres.\n" +
                "A média de idade do grupo é: " + (double) somaIdades / 5 + "\n" +
                "A média de idade dos homens é: " + mediaIdadeHomens + "\n" +
                "Quantidade de mulheres com mais de 20 anos: " + qtdMulheresMaisDe20);
    }
}
