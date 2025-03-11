/*
*****63*****
Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na tela:
• O somatório entre todos os valores
• Qual foi o menor valor digitado
• A média entre todos os valores
• Quantos valores são pares
 */
import javax.swing.JOptionPane;
public class ex63 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Utilizar um Loop ""do while" pedindo para o usuario digitar vários números
                2 - A cada interação perguntar se quer continuar
                3 - Cada interação realizar uma divisão por 2 e verificar se o resto é zero, caso for incrementa uma variável contadora 
                4 - SOmar todas as idades e dividir pela quantidade
                5 - Realizar uma comparação, imprimindo quanl foi o menor númeero entre eles, criando uma variavel que compara e armazena o mais novo numero
                """.stripIndent());

        boolean continuar = true;
        int quantidade = 0;
        int soma = 0;
        int idades21 = 0;
        int menorValor = 999;
        int pares = 0;
        do {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Digite uma número inteiro: "));
                if(num < 0){
                    throw new IllegalArgumentException("Valor não pode ser negativo!");
                }
                quantidade += 1;
                soma += num;
                if (num < menorValor) {
                    menorValor = num;
                }
                if (num % 2 == 0) {
                    pares += 1;
                }
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.NO_OPTION) {
                    continuar = false;
                }
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor não pode ser negativo!");
            }catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }while (continuar == true);

        JOptionPane.showMessageDialog(null, "A soma de todos os valores é:  " + soma + "\n" +
                "O menor valor digitado foi:  " + menorValor +  "\n" +
                "A média entre as idades é de:  " + (soma / quantidade) + "\n" +
                "A quantidade de valores pares é de:  " + pares);
    }
}
