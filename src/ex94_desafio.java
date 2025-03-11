
/*
*****94****
[DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado Fibonacci() que recebe um único valor inteiro como
parâmetro, indicando quantos termos da sequência serão mostrados na tela. O seu procedimento deve receber esse valor e mostrar a
quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
 */
import javax.swing.*;
public class ex94_desafio {
    static void fibonacci(int num) {
        int a = 1, b = 1, n = num;
        for(int i = 0; i < n; i++){
            System.out.print(a + " >> ");
            int fib = a + b;
            a = b;
            b = fib;
        }
        System.out.print("FIM ");

    }


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Algoritmo:
                1 - Criar um procedimento que recebe um número
                2 - Realizar o algoritmo de Fibonacci n vezes, de acordo com o número que foi passado como parâmetro
                3 - Imprimir a sequência
                """.stripIndent());

        fibonacci(9);

    }
}
