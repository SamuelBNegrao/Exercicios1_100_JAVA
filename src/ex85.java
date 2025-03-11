/*
*****85****
Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e guarde esses dados em três vetores. No final,
mostre uma listagem contendo apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ex85 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 5 repetições, pedindo os nomes, sexo e salário das pessoas
                2 - Guardar os valores em listas correspondentes
                3 - Criar um loop para percorrer os dados e mostrar apenas mulheres que ganham mais de R$5 mil
                """);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();
        ArrayList<Float> salarios = new ArrayList<>();

        for (int i = 0; i < 5; i++) {  // Loop corrigido para 5 repetições
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");

            String sexo;
            do {
                sexo = JOptionPane.showInputDialog("Digite o sexo de " + nome + " (M/F):").toUpperCase();
            } while (!sexo.equals("M") && !sexo.equals("F")); // Validação para aceitar apenas "M" ou "F"

            float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário de " + nome + ":"));

            nomes.add(nome);
            sexos.add(sexo);
            salarios.add(salario);
        }

        // Exibe apenas mulheres que ganham mais de R$5.000
        StringBuilder maiores = new StringBuilder("Funcionárias que ganham mais de R$5.000:\n");
        boolean encontrouMaior = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (sexos.get(i).equals("F") && salarios.get(i) > 5000) {
                maiores.append(nomes.get(i)).append(" - R$").append(String.format("%.2f", salarios.get(i))).append("\n");
                encontrouMaior = true;
            }
        }

        if (!encontrouMaior) {
            maiores.append("Nenhuma funcionária com salário acima de R$5.000 foi encontrada.");
        }

        JOptionPane.showMessageDialog(null, maiores.toString());
    }
}
