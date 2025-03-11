/*
*****56*****
Crie um programa que leia vários números pelo teclado e mostre no final o somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
 */
import javax.swing.JOptionPane;
public class ex56 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Criar um Boolean verdadeiro
        2 - Solicitar que o usuário escreva números inteiros, e caso digite 1111 o loop para
        3 - Criar um loop onde se o usuario der a entrada de 1111 o loop termina, mostrando a soma dos números inteiros
        4 - A cada interação do usuário o loop soma os números inteiros em uma variável
        """.stripIndent());
        int somanum = 0;
        boolean continuar = true;

        while (continuar) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para somar.\nDigite 1111 para parar"));
            if(num == 1111){
                continuar = false;
                JOptionPane.showMessageDialog(null, "A soma dos números foi de: " + somanum);
            }else{
                somanum += num;
            }

        }

    }
}
