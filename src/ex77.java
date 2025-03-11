/*
*****77****
Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes
informados, na ordem inversa daquela em que eles foram informados.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ex77 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com limite de 7 e solicitar que o usuário digite 7 nomes
                2 - Adicionar cada nome em uma lista
                3 - Criar um loop que decrementa uma variavel contadora de 7 para 0. Adicionando os numeros dos indices em uma nova lista
                4 - Imprimir nova lista
                """.stripIndent());

        ArrayList <String> lista = new ArrayList<>();
        ArrayList <String> listareversa = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            String nomes = JOptionPane.showInputDialog("Digite um nome: ");
            lista.add(nomes);
        }
        int cont = 6;
        while ( cont >= 0) {
            listareversa.add(lista.get(cont));
            cont--;
        }
        JOptionPane.showMessageDialog(null, "Lista reversa: \n" + listareversa);



    }
}
