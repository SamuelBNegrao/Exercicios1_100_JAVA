/*
*****81****
Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No final, mostre:
• Qual é a média de idade das pessoas cadastradas
• Em quais posições temos pessoas com mais de 25 anos
• Qual foi a maior idade digitada (podem haver repetições)
• Em que posições digitamos a maior idade
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ex81 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 8 repetições solicitando a idade de 8 pessoas
                2 - Adicionar cada uma das interações em uma variavel e dividir por 8, obtendo a media
                3 - Fazer uma comparação percorrendo toda a lista e analisando quais idades foram maiores que 25
                5 - Percorrer o vetor  em busca na maior idade e registrar em outra lista a posição dessa idade
                """.stripIndent());

        ArrayList<Integer> listaIdade = new ArrayList<>();
        ArrayList <Integer> maiorIdade = new ArrayList<>();
        ArrayList <Integer> idade25 = new ArrayList<>();
        int mediaIdade = 0,maiorIdadeNum = 0;
        for (int i = 0; i < 8; i++) {
            int idades = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um idade: "));
            mediaIdade += idades;
            listaIdade.add(idades);
        }
        for (int i = 0; i < listaIdade.size(); i++) {
            if (listaIdade.get(i) > 25) {
                idade25.add(1);
            }else{
                idade25.add(0);
            }
            if (listaIdade.get(i) > maiorIdadeNum) {
                maiorIdadeNum = listaIdade.get(i);
            }
        }
        for (int i = 0; i < listaIdade.size(); i++) {
            if (listaIdade.get(i) == maiorIdadeNum){
                maiorIdade.add(1);
                }else{
                maiorIdade.add(0);
                }
        }
        JOptionPane.showMessageDialog(null, "A média de idade é: " + (mediaIdade / 8) + "\n" +
                "Pessoas com mais de 25 anos: \n" + idade25 + "\n" +
                "A maior idade digitada foi: " + maiorIdadeNum + "\n" +
                "As maiores idades foram digitas nas posições: \n" + maiorIdade);

    }
}
