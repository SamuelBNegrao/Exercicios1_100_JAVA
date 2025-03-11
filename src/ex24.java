/*
*****24*****
Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km. Calcule o preço da
passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.
 */
import javax.swing.JOptionPane;
public class ex24 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicite do usuário a distância da viagem em Km\n" +
                "2 - Se a distância for até 200km multiplicar 0.50 pelo valor\n" +
                "3 - Caso contrário multiplique 0,45 pelo valor obtido\n");

        try {
            String distanciaStrg = JOptionPane.showInputDialog("Olá! Qual a distância que vc quer viajar?");
            int valor = Integer.parseInt(distanciaStrg);

            if(valor < 0){
                throw new IllegalArgumentException("Valor não pode ser negativo!");
            }
            if (valor <= 200) {
                JOptionPane.showMessageDialog(null, "Legal! O valor da sua viagem será de R$" + (valor * 0.5));
            } else {
                JOptionPane.showMessageDialog(null, "Legal! O valor da sua viagem será de R$" + (valor * 0.45));
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor não pode ser negativo!");
    }   catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
}
}

