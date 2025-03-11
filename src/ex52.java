/*
*****52*****
Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
• Qual é a média de idade do grupo
• Quantas pessoas tem mais de 18 anos
• Quantas pessoas tem menos de 5 anos
• Qual foi a maior idade lida
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class ex52 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Fazer um loop onde o usuário digita 10 números
                2 - Somar cada idade e dividir por 10
                3 - Fazer um loop percorrendo uma lista para um variável contar quantos números são maiores que 18 e menores que 5
                4 - Durante o Loop salvar qual foi a maior idade e printar todos os resultados
                """.stripIndent());

        List<Integer> idades = new ArrayList<>();
        int adulto = 0;
        int crianca = 0;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i + 1) + "º idade:"));
            idades.add(num);
        }
        int numMaior = idades.get(0);
        for (int num : idades) {
            soma += num;

            if (num > numMaior) {
                numMaior = num;
            }
            if (num > 18){
                adulto+=1;
            }else if (num < 5){
                crianca += 1;
            }

        }
        JOptionPane.showMessageDialog(null, "A média do grupo todo é de: " + (soma / 10) + "\n" +
                 "A maior idade é de: " + numMaior + "\n" +
                "A quantidade de pessoas com mais de 18 anos é de: "+ adulto +"\n" +
                "A quantidade de pessoas com menos de 5 anos é de: " +crianca + "\n");
    }
}
