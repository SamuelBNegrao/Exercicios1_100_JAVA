/*
*****33*****
Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
import javax.swing.JOptionPane;
public class ex33 {
    public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Perguntar ao usuário o valor da casa, seu salário mensal e em quantos anos pretende pagar
        2 - Verificar o valor de 30% do salário do usuário
        3 - Dividir o valor da casa pela quantidade de meses em anos a ser pago
        4 - Se as parcelas mensais forem menores que 30% do valor, aprova o empréstimo, caso contrário, não.
        """.stripIndent());

        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário: "));
        float valorCasa = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da casa que deseja comprar: "));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Em quantos anos que deseja pagar? "));
        double salario30 = (salario * 0.3);
        double meses = anos * 12;
        double prestacao = valorCasa /meses;
        String prestacaoFormatada = String.format("%.2f", prestacao);

        if((prestacao) < salario30){
            JOptionPane.showMessageDialog(null, "O valor da prestação mensal é de: " + prestacaoFormatada +"\n" +
                                                                         "Seu empréstimo foi aprovado!!! Parabéns.");
        }else{
            JOptionPane.showMessageDialog(null, "O valor da prestação mensal é de: " + prestacaoFormatada + "\n" +
                    "Ela excede 30% do seu salário mensal. Seu empréstimo foi negado...");
        }
    }
}
