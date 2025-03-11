/*
*****42*****
Faça um algoritmo que pergunte ao usuário um número inteiro e positivo qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */
import javax.swing.*;
public class ex42 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Pedir ao usuário para digitar um número que será armazenado em uma variável
                2 - Utilizar um loop for para cada fez que o loop for executado a variável incrementa 1
                3 - Quando o loop terminar, imprimir Acabou
                """.stripIndent());


        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para contar: "));
        for (int i = 1; i < (num+1); i+=1) {
            JOptionPane.showMessageDialog(null, i);
        }
        JOptionPane.showMessageDialog(null, "Acabou!");
    }
}