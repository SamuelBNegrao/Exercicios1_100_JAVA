/*
*****60*****
Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas. O programa vai perguntar se o usuário quer ou não continuar.
No final, mostre:
• O nome da pessoa mais velha
• O nome da mulher mais jovem
• A média de idade do grupo
• Quantos homens tem mais de 30 anos
• Quantas mulheres tem menos de 18 anos
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class ex60 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um Boolean verdadeiro de continuar
                2 - Pedir para o usuario escolher entre homem e mulher e aumentar uma interação na vairiavel contadora para os homens
                3 - Pedir para o usuario digitar sua idade e seu nome
                4 - Criar um avariavel contadora que avaliará qual é a posição do nome da pesoa em uma lsita caso ela seja selecionada
                4 - Criar duas variaveis que irão armazenar as idades. 
                5- 
                6 - Imprimir os requisitos
                """.stripIndent());

                boolean continuar = true;
                ArrayList<String> nomes = new ArrayList<>();
                ArrayList<Integer> idades = new ArrayList<>();
                String[] listaSexo = {"HOMEM", "MULHER"};

                int maiorIdade = Integer.MIN_VALUE;
                String nomeMaisVelho = "";
                int somaIdades = 0;
                int qtdPessoas = 0;
                int homensMaisDe30 = 0;
                int mulheresMenosDe18 = 0;
                String nomeMulherMaisJovem = "";
                int idadeMulherMaisJovem = Integer.MAX_VALUE;

                while (continuar) {
                    int escolhaSexo = JOptionPane.showOptionDialog(null, "Qual é seu sexo?", "Pesquisa",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaSexo, listaSexo[0]);

                    String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

                    nomes.add(nome);
                    idades.add(idade);
                    somaIdades += idade;
                    qtdPessoas++;

                    // Atualiza a pessoa mais velha
                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                        nomeMaisVelho = nome;
                    }

                    if (escolhaSexo == 0) { // Homem
                        if (idade > 30) {
                            homensMaisDe30++;
                        }
                    } else { // Mulher
                        if (idade < 18) {
                            mulheresMenosDe18++;
                        }
                        // Atualiza a mulher mais jovem
                        if (idade < idadeMulherMaisJovem) {
                            idadeMulherMaisJovem = idade;
                            nomeMulherMaisJovem = nome;
                        }
                    }

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.NO_OPTION) {
                        continuar = false;
                    }
                }

                double mediaIdade = (qtdPessoas > 0) ? (double) somaIdades / qtdPessoas : 0;

                JOptionPane.showMessageDialog(null, "Resultados:\n" +
                        "• Pessoa mais velha: " + nomeMaisVelho + " (" + maiorIdade + " anos)\n" +
                        "• Mulher mais jovem: " + (nomeMulherMaisJovem.isEmpty() ? "Nenhuma cadastrada" : nomeMulherMaisJovem + " (" + idadeMulherMaisJovem + " anos)") + "\n" +
                        "• Média de idade do grupo: " + String.format("%.2f", mediaIdade) + " anos\n" +
                        "• Homens com mais de 30 anos: " + homensMaisDe30 + "\n" +
                        "• Mulheres com menos de 18 anos: " + mulheresMenosDe18);
            }
        }

