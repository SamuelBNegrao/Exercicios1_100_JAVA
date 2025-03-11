/*
*****21*****
Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.
 */
import javax.swing.JOptionPane;
public class ex21 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicite que o usuário digite um ano\n" +
                "2 - Divida esse número por 4\n" +
                "3 - Se não houver resto, o ano é bissexto\n"+
                "4 - Caso contrário, não é bissexto");

        String anoStrg = JOptionPane.showInputDialog("Digite o ano do dia: ");
        int ano = Integer.parseInt(anoStrg);
        int bissexto = ano % 4;

        if(bissexto == 0){
            JOptionPane.showMessageDialog(null, ano + " é um ano BISSEXTO!");
        }else{
            JOptionPane.showMessageDialog(null, ano + "  não é um ano BISSEXTO!");
        }
    }
}
