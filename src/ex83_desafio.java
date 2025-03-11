/*
*****83****
[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números aleatórios (entre 0 e 99) gerados pelo computador.
Logo em seguida, mostre os números gerados e depois coloque o vetor em ordem crescente, mostrando no final os valores ordenados.
 */
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
public class ex83_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 20 repetições fazendo com que o computador crie números aleatórios entre 0 e 99
                2 - Criar um loop comparando se o indice i > i+1
                3 - Se for verdade ele troca a posição dos indices
                5 - Caso não haja mais comparações o boolean muda para falso, terminando a ordenação e imprimindo a lista 
                """.stripIndent());
        boolean troca = true;
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            int num = rand.nextInt(99) + 1;
            lista.add(num);
        }
        System.out.println(lista);
        do {
            troca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    int num = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, num);
                    troca = true;
                }
            }
        }while(troca);
       System.out.println(lista);
    }
}


