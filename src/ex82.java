/*
*****82****
Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em um vetor. No final, mostre:
• Qual é a média da turma
• Quantos alunos estão acima da média da turma
• Qual foi a maior nota digitada
• Em que posições a maior nota aparece
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ex82 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 10 repetições solicitando a nota de 10 alunos
                2 - Adicionar cada uma das interações em uma variavel e dividir por 10, obtendo a media
                3 - Fazer uma comparação percorrendo toda a lista e analisando quais notas estão acima da média da turma
                5 - Percorrer o vetor  em busca  da maior nota e pirntar em que posiçao a nota está
                """.stripIndent());

        ArrayList <Float> lista = new ArrayList<>();
        ArrayList <Integer> lista2 = new ArrayList<>();
        float somaNotas = 0, mediaNotas = 0, maiorNota = 0;
        int qtdNotasMedia = 0;
        for (int i = 0; i < 10; i++) {

            float notas = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota de um aluno: "));
            lista.add(notas);
            somaNotas += notas;
        }
        mediaNotas = somaNotas / 10;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) > mediaNotas ){
                qtdNotasMedia += 1;
                maiorNota = lista.get(i);
                lista2.add(1);
            }else{
                lista2.add(0);
            }
        }
        JOptionPane.showMessageDialog(null, "A média da turma é: " +mediaNotas + "\n" +
                "A quantidade de alunos acima da média é: \n" + qtdNotasMedia + "\n" +
                "A maior nota digitada foi: " + maiorNota + "\n" +
                "As maiores notas foram digitas nas posições: \n" + lista2);

    }
}
