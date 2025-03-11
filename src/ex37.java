/*
*****37*****
• Uma empresa precisa reajustar o salário dos seus funcionários, dando um aumento de acordo com alguns fatores. Faça um programa que
leia o salário atual, o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. No final, mostre o seu novo
salário, baseado na tabela a seguir:
• Mulheres
• menos de 15 anos de empresa: +5%
• de 15 até 20 anos de empresa: +12%
• mais de 20 anos de empresa: +23%
• Homens
• menos de 20 anos de empresa: +3%
• de 20 até 30 anos de empresa: +13%
• mais de 30 anos de empresa: +25%
 */
import javax.swing.JOptionPane;
public class ex37 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Perguntar ao usuário seu salário, genero e tempo de colaboração
        2 - Dependendo do seu gênero ele irá se encaixar em duas categorias difentes 
        3 - Pegar seu salário atual e aumentar de acordo com a porcentagem definida em cada categoria
        4 - Imprimir o salário com o aumento
        """.stripIndent());

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String[] lista = {"HOMEM", "MULHER"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Qual é seu sexo?", // Mensagem
                "Empresa Feliz", // Título da janela
                JOptionPane.DEFAULT_OPTION, // Tipo de opção
                JOptionPane.QUESTION_MESSAGE, // Ícone
                null, // Ícone personalizado (null para o padrão)
                lista, // Opções
                lista[0]);
        String sexo = lista[escolha];
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário: "));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você trabalha na empresa: "));

        if (sexo.equals("HOMEM")) {
            if (anos < 20){
                double reajuste = salario * 0.03;
                JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + reajuste) + "\n"+
                        "Obrigado por trabalhar conosco");
            }else if(anos >= 20 && anos <= 30){
                double reajuste = salario * 0.13;
                JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + reajuste) + "\n"+
                        "Obrigado por trabalhar conosco");
            }else{
                double reajuste = salario * 0.25;
                JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + reajuste) + "\n"+
                        "Obrigado por trabalhar conosco");
            }
        }else{
            if (anos < 15){
                double reajuste = salario * 0.05;
                JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + reajuste) + "\n"+
                        "Obrigado por trabalhar conosco");
            }else if(anos >= 15 && anos <= 20){
                double reajuste = salario * 0.12;
                JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + reajuste) + "\n"+
                        "Obrigado por trabalhar conosco");
            }else {
                double reajuste = salario * 0.23;
                JOptionPane.showMessageDialog(null, "Olá " + nome + ", seu novo salário é de R$" + (salario + reajuste) + "\n" +
                        "Obrigado por trabalhar conosco");
            }
        }

    }
}

