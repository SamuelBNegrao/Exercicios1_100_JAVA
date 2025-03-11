/*
*****04*****
Desenvolva um programa em Java que leia dois números inteiros e mostre o somatório entre eles.
 */
import javax.swing.JOptionPane;
public class ex04 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Ler dois números\n" +
                "2 - Realizar a soma e armazenar em uma variável\n" +
                "3 - Imprimir soma");
        int x = 0;
        int y = 0;
        int soma = x + y;
        System.out.println("A soma é--> " + soma);
        if(soma != 0){
            System.out.println("O valor -> " + soma + " é diferente de zero");
        }else{
            System.out.println("A soma é igual a -> " + soma);
        }
    }
}
