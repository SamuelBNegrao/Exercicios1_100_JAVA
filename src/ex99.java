/*
*****99****
Faça um programa que possua uma função chamada Potencia(), que vai receber dois parâmetros numéricos (base e expoente) e vai
calcular o resultado da exponenciação. Ex: Potencia(5,2) vai calcular 5**2 = 25
 */
import javax.swing.JOptionPane;
public class ex99 {

    static int potencia(int num, int potencia){
        int resultado = 1;

        // Loop para calcular a potência
        for (int i = 0; i < potencia; i++) {
            resultado *= num;
        }

        return resultado;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Solicitar dois números, sendo um npumero incial e uma potencia
                2 - Passar esses números como parâmetros para a função potência
                3 - Multiplicar o primeiro npumero pela potência passada
                4 - Retornar o resultado e imprimir
                """);

        int num =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial: "));
        int potencianum =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para ser sua potência: "));
        JOptionPane.showMessageDialog(null,"Super soma é : " +  potencia(num, potencianum));
    }
}
