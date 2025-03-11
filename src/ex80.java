/*
*****80****
Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 15 sorteados pelo computador.
Depois disso, peça para o usuário digitar um número (chave) e seu programa deve mostrar em que posições essa chave foi encontrada.
Mostre também quantas vezes a chave foi sorteada.
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;
public class ex80 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 30 repetições onde o computador escoleh numeros aleatorios entre 1 e 15 e adiciona todos a um vetor
                2 - SOlicitar do usuário um número entre 1 e 15
                3 - GErar um loop comparando cada numero dentro da lista com o número digitado pelo usuário
                5 - Se o número for encontrado incrementar a variavel contadora e adicionar 1 a uma nova lista
                6 - Imprimir posição e variavel contadora da nova lista
                """.stripIndent());

        ArrayList <Integer> listaPC = new ArrayList<>();
        ArrayList <Integer> listaChave = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Random rand = new Random();
            int num = rand.nextInt(15) + 1;
            listaPC.add(num);

        }
        int usuario = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro entre 1 e 15: "));
        int qtd = 0;
        for (int i = 0; i < listaPC.size(); i++) {
            if(listaPC.get(i).equals(usuario)) {
                listaChave.add(1);
                qtd += 1;
                }else{
                listaChave.add(0);
            }
        }
        JOptionPane.showMessageDialog(null,  "O número buscado foi sorteado " + qtd + " vezes\n" +
                "O número aparece nas seguintes posições \n " + listaChave);

    }
}
