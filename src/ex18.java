/*
*****18*****
Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.
 */
import java.time.Year;
import javax.swing.JOptionPane;
public class ex18 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Perguntar ao usuário sua idade\n" +
                "2 - Subtrair o ano de nascimento do usuário pelo ano atual \n" +
                "3 - Se for maior ou igual a 18 imprimir uma mensagem que o usuário pode votar\n" +
                "4 - Caso não for, imprima uma mensagem para o usuário");
        String anoStr = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
        int ano = Integer.parseInt(anoStr);
        int anoAtual = Year.now().getValue();
        int podeVotar = anoAtual - ano;

        if(podeVotar >= 18){
            JOptionPane.showMessageDialog(null, "Legal! Você é maior de idade, já pode votar!");
        }else{
            JOptionPane.showMessageDialog(null, "Você ainda não é maior de idade, não pode votar!");
        }
    }
}
