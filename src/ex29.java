/*
*****29*****
Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu
novo salário, reajustado de acordo com a tabela a seguir:
• Até 3 anos de empresa: aumento de 3%
• entre 3 e 10 anos: aumento de 12.5%
• 10 anos ou mais: aumento de 20%
 */
import javax.swing.*;
public class ex29 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicitar o nome, salário e quantos anos um funcionário trabalha na empresa\n" +
                "2 - Se ele trabalhar até 3 anos na empresa, imprimir seu salário com um aumento de 3%\n" +
                "3 - Se ele trabalhar entre 3 e 10 anos na empresa, imprimir seu salário com um aumento de 12,5%\n" +
                "4 - Se ele trabalhar 10 anos ou mais, impirimir seu salário com um aumento de 20% \n");

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário: "));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você trabalha na empresa: "));
        double  anosA = salario * 0.03;
        double  anosB = salario * 0.125;
        double  anosC = salario * 0.20;

        if(anos <= 3){
            JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + anosA));
        }else if(anos > 3 && anos <= 9){
            JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + anosB));
        }else{
            JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + anosC) + "\n"+
                    "Obrigado por estar conosco todo esse tempo!");
        }
    }
}
