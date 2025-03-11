/*
*****69*****
[DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma PA (Progressão Aritmética), mostrando na tela os 10
primeiros elementos da PA e a soma entre todos os valores da sequência.
 */
import javax.swing.JOptionPane;
public class ex69_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar do usuário o primeiro termo da PA e a razão
                2 - Caso a razão seja negativa, o loop decrementara, caso positiva incrementará
                3 - Imprimir o resultadp após 10 interações
                """.stripIndent());


                float num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro termo da PA: "));
                float razao = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a razão da PA: "));
                float soma = 0;

                System.out.print("Os 10 primeiros termos da PA são: ");
                for(int i = 0; i < 10; i++){
                    float termo = num + (i * razao); // Calcula o termo correto
                    System.out.print(termo + " "); // Exibe o termo
                    soma += termo; // Soma corretamente o termo na variável soma
                }

                System.out.println("\nA soma entre todos os valores da sequência é: " + soma);
            }
        }
