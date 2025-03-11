/*
*****59*****
Crie um programa que leia o sexo e a idade de várias pessoas.
O programa vai perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
• qual é a maior idade lida
• quantos homens foram cadastrados
• qual é a idade da mulher mais jovem
• qual é a média de idade entre os homens
 */
import javax.swing.JOptionPane;
public class ex59 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Criar um Boolean verdadeiro de continuar
        2 - Pedir para o usuario escolher entre homem e mulher e aumentar uma interação na vairiavel contadora para os homens
        3 - Pedir para o usuario digitar sua idade
        4 - Criar duas variaveis que irão armazenar as idades. No caso das mulheres ela armazenará a mais nova
        5- Enquanto para os homens ela somará sempre
        6 - Imprimir os requisitos
        """.stripIndent());

        boolean continuar = true;
        String[] listaSexo = {"HOMEM", "MULHER"};
        int maiorIdade = 0;
        int qtdHomem = 0;
        int menorMulher = 1000;
        int idadeHomem = 0;
        int idadeHomemSoma = 0;
        int idadeMulher = 0;
        while (continuar) {
            boolean mulher = false;
            boolean homem = false;
            int escolhaSexo = JOptionPane.showOptionDialog(null, "Qual é seu sexo?", "Pesquisa",
                    0, 3, null, listaSexo, listaSexo[0]);
            if (escolhaSexo == 0) {
                homem = true;
                qtdHomem+=1;
                idadeHomem = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
                idadeHomemSoma += idadeHomem;

            } else {
                mulher = true;
                idadeMulher = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?  "));
                if (menorMulher > idadeMulher) {
                    menorMulher = idadeMulher;
                }
            }
            if (idadeMulher > idadeHomem) {
                maiorIdade = idadeMulher;
            }else{
                maiorIdade = idadeHomem;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }


        }
        JOptionPane.showMessageDialog(null, "Maior idade lida: " + maiorIdade + "\n" +
                "Total de homens cadastrados: " + qtdHomem + "\n" +
                "A idade da mulher mais jovem é de: " + menorMulher + "\n" +
                "A média da idade entre os homens é de: " + (idadeHomemSoma / qtdHomem));
    }
}
