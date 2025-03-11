/*
*****35*****
Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O aluguel de um carro custa R$90 por dia para carro
popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa que leia o tipo de carro
alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com
a tabela a seguir:
• Carros populares (aluguel de R$90 por dia)
• Até 100Km percorridos: R$0,20 por Km
• Acima de 100Km percorridos: R$0,10 por Km
• Carros de luxo (aluguel de R$150 por dia)
• Até 200Km percorridos: R$0,30 por Km
• Acima de 200Km percorridos: R$0,25 por Km
 */
import javax.swing.JOptionPane;
public class ex35 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Solicitar do usuário qual é o tipo de carro, LUXO ou POPULAR.
        2 - Perguntar quantos dias o carro foi alugado e quantos km foram percorridos.
        3 - Encaixar o preço do carro de acordo com os valores disponibilizados
        4 - Multiplicar o valor por km dependendo de quantos km foram percorridos.
        """.stripIndent());

        String[] lista = {"LUXO", "POPULAR"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Qual modelo de carro foi alugado?", // Mensagem
                "Aluguel", // Título da janela
                JOptionPane.DEFAULT_OPTION, // Tipo de opção
                JOptionPane.QUESTION_MESSAGE, // Ícone
                null, // Ícone personalizado (null para o padrão)
                lista, // Opções
                lista[0]);
        String modeloEscolhido = lista[escolha];
        float km = Float.parseFloat(JOptionPane.showInputDialog("Quantos km foram percorridos? "));
        int dias = Integer.parseInt((JOptionPane.showInputDialog("Quantos dias o carro foi usado? ")));


        if (modeloEscolhido.equals("POPULAR")) {
            int totalDiapop = dias * 90;
            if(km <= 100){
                double totalKMpop = km * 0.20;
                JOptionPane.showMessageDialog(null, "Total a pagar:\n" + "R$" +(totalDiapop + totalKMpop));
            }else{
                double totalKMpop = km * 0.10;
                JOptionPane.showMessageDialog(null, "Total a pagar:\n" + "R$" +(totalDiapop + totalKMpop));
            }
        }else{
            int totalDia = dias * 150;
            if(km <= 200){
                double totalKM = km * 0.30;
                JOptionPane.showMessageDialog(null, "Total a pagar:\n" + "R$" +(totalDia + totalKM));
            }else{
                double totalKM = km * 0.25;
                JOptionPane.showMessageDialog(null, "Total a pagar:\n" + "R$" +(totalDia + totalKM));
            }
        }
    }
}
