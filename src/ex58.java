/*
*****58*****
Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa vai parar quando for digitada a idade 999.
No final, mostre quantos alunos existem na turma e qual é a média de idade do grupo.
 */
import javax.swing.JOptionPane;
public class ex58 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Criar um Boolean verdadeiro
        2 - Solicitar que o usuário escreva números inteiros, e caso digite 999 o loop para 
        3 - Para cada interação incrementar 1 em uma variavel contadora  e somar as idades em outra
        4 - Imprimir a soma das idades dividida pela quantidade de alunos digitados 
        """.stripIndent());
        int somanum = 0;
        int alunosqtd = 0;
        boolean continuar = true;

        while (continuar) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de um aluno..\nDigite 999 para parar"));
            if(num == 999){
                continuar = false;
                JOptionPane.showMessageDialog(null, "A média da idade dos alunos foi de : " + (somanum / alunosqtd));
            }else{
                somanum += num;
                alunosqtd++;
            }

        }

    }
}
