/*
*****23*****
Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres.
Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
Homens ganham 5% de desconto
Mulheres ganham 13% de desconto
 */
import javax.swing.JOptionPane;
public class ex23 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicite que o usuário digite seu nome e seu sexo\n" +
                "2 - Solicite o valor total da compra\n" +
                "3 - Se for homem subtraia 5% do valor da compra\n" +
                "4 - Caso for mulher, subtraia 13% do valor\n");

        try{
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            String sexo = JOptionPane.showInputDialog("Qual é Homem ou Mulher? ");
            sexo.toLowerCase();
            if(!sexo.equals("homem") && !sexo.equals("mulher")){
                throw new IllegalArgumentException("Digite Homem ou Mulher!");
            }
            String valorStrg = JOptionPane.showInputDialog("Digite o valor da compra: ");
            int valor = Integer.parseInt(valorStrg);
            double valorDescontoM = 0.13;
            double valorDescontoH = 0.05;

            if (sexo.equals("homem")){
                JOptionPane.showMessageDialog(null, "Feliz dia da mulher, " + nome + "!" + "\n" +
                                                                            "O valor da compra com desconto é de R$" + (valor - (valor * valorDescontoH)));
            }else{
                JOptionPane.showMessageDialog(null, "Feliz dia da mulher, " + nome +"!" + "\n" +
                                                                            "O valor da compra com desconto é de R$" + (valor - (valor * valorDescontoM)));
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida! Homem ou mulher!.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
