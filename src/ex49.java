/*
*****49*****
Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.
 */
import javax.swing.JOptionPane;
public class ex49 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Pedir para o usuário inserir 6 números inteiros em um loop de 6
                2 - A cada interação do usuário, dividir cada número por 2, se não sobrar resto adicionar 1 a uma variável mostrando os pares
                3 - Se houver resto na divisão, adicionar a uma outra variável mostrando os ímpares.
                """.stripIndent());

        int qtdVezes = 6;
        int par = 0;
        int impar = 0;
        for(int i = 0; i < 6; i+=1){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para descobrirmos quantos são pares e quantos são ímpare.\n" +
                    "Faltam mais " + qtdVezes + " números"));
            if(num % 2 == 0){
                par+=1;
                qtdVezes-=1;
            }else{
                impar+=1;
                qtdVezes-=1;
            }
        }
        JOptionPane.showMessageDialog(null, "Você digitou um total de " + par + " números pares e " + impar + " números ímpares.");
    }
}
