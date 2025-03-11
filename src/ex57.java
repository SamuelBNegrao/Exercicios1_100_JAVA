/*
*****57*****
Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às mulheres.
O programa vai perguntar ao usuário se ele quer continuar ou não sempre que ler os dados de um funcionário.
 */
import javax.swing.JOptionPane;
public class ex57 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Criar um Boolean verdadeiro de continuar
        2 - Pedir para o usuario escolher entre homem e mulher e aumentar uma interação na vairiavel contadora de cada sexo
        3 - Pedir para o usuario digitar o salario.
        4 - Perguntar se ele gostaria de continuar ou não.
        5 - Caso o usuário escolha "NÃO" imprima a soma de todos os salários
        """.stripIndent());


        boolean continuar = true;
        String[] listaSexo = {"HOMEM", "MULHER"};
        float salarioHomem = 0;
        float salariomulher = 0;
        float salariototalH = 0;
        float salariototalM = 0;
        while (continuar) {
            boolean mulher = false;
            boolean homem = false;
            int escolhaSexo = JOptionPane.showOptionDialog(null, "Qual é seu sexo?", "Pesquisa",
                    0, 3, null, listaSexo, listaSexo[0]);
            if (escolhaSexo == 0) {
                homem = true;
                salarioHomem = Float.parseFloat(JOptionPane.showInputDialog("Digite um seu salário: "));

            } else {
                mulher = true;
                salariomulher = Float.parseFloat(JOptionPane.showInputDialog("Digite um seu salário: "));

            }
            salariototalM += salariomulher;
            salariototalH += salarioHomem;
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }


        }
        JOptionPane.showMessageDialog(null, "Total de salário pago a Homens: " + (salariototalH) + "\n" +
                "Total de salário pago a Mulheres: " + (salariototalM));
    }
}
