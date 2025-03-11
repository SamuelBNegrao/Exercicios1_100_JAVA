/*
*****84****
Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses valores em dois vetores, em posições relacionadas. No
final, mostre uma listagem contendo apenas os dados das pessoas menores de idade.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ex84 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 9 repetições, pedindo os nomes e idades das pessoas
                2 - Guardar os valores em listas correspondentes
                3 - Criar um loop para percorrer os dados e mostrar apenas menores de idade
                """);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();

        // Coleta os dados
        for (int i = 0; i < 9; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome + ":"));

            nomes.add(nome);
            idades.add(idade);
        }

        // Exibe apenas menores de idade
        StringBuilder menores = new StringBuilder("Pessoas menores de idade:\n");
        boolean encontrouMenor = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (idades.get(i) < 18) {
                menores.append(nomes.get(i)).append(" - ").append(idades.get(i)).append(" anos\n");
                encontrouMenor = true;
            }
        }

        if (!encontrouMenor) {
            menores.append("Nenhuma pessoa menor de idade foi cadastrada.");
        }

        JOptionPane.showMessageDialog(null, menores.toString());
    }
}
