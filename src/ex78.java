/*
*****78****
Escreva um programa que leia 15 números e guarde-os em um vetor. No final, mostre o vetor inteiro na tela e em seguida
mostre em que posições foram digitados valores que são múltiplos de 10.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ex78 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um loop com 15 repetições e solicitar que o usuário digite 15 numeros, adicionando-os em um vetor
                2 - Criar uma de tamnho 15 com espaços vazios 
                3 - Gerar uma comparação para cada numero digitado
                4 - Caso o usuário digite um número múltiplo de 10, ele adiciona "1" na mesma posição dessa nova lista.
                5 - imprimiir ambas as listas
                """.stripIndent());

        ArrayList <Integer> lista = new ArrayList<>();
        ArrayList <Integer> listaindex = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            lista.add(num);
            if(num % 10 ==0){
                listaindex.add(1);
            }else{
                listaindex.add(0);
            }
        }
        JOptionPane.showMessageDialog(null, "Na lista abaixo, 1 mostra os divisiveis por 10\n"+ "Lista: " + lista +"\n" +
                "Div: " +listaindex + "\n");
    }
}
