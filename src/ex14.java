/*
*****14*****
A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa em Java
que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex14 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar do usuário a quantidade de km rodados com o carro e a quantidade de dias
                2 - Multiplicar cada dia por 90 e cada km por 0.020
                3 - Somas os dois e imprimir ambos
                """.stripIndent());
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos Km foram rodados com o carro: ");
        float km = scan.nextFloat();
        System.out.println("Por quantos dias o carro foi alugado: ");
        int dias = scan.nextInt();
        scan.close();
        float diasConta = (dias * 90);
        double kmConta = (km * 0.20);
        System.out.println("Preço total a pagar: R$" + (diasConta + kmConta));
    }
}
