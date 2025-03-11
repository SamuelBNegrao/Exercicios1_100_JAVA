/*
*****22*****
Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.
 */
import java.time.Year;
import javax.swing.JOptionPane;
public class ex22 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicite que o usuário digite seu nome e ano de nascimento\n" +
                "2 - Subtraia o ano obtido do ano atual\n" +
                "3 - Se for igual a 18, imprima que o jovem pode se alistar\n" +
                "4 - Caso contrário, imprima que ainda não pode se alistar\n" +
                "5 - Se for maior que 18, imprima quantos anos passaram do alistamento");

            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            String anoStrg = JOptionPane.showInputDialog("Digite seu ano de nascimento: ");
            int ano = Integer.parseInt(anoStrg);
            int anoAtual = Year.now().getValue();
            int exercito = anoAtual - ano;
            int faltaAnos = 18 - exercito;
            int passaAnos = exercito - 18;

        if (exercito == 18) {
            JOptionPane.showMessageDialog(null,nome + " , esse ano você deve se alistar no exército!");
        }else if (exercito < 18) {
            JOptionPane.showMessageDialog(null, nome + " , você ainda não tem a idade para se alistar no exército!\n" +
                                                    "Ainda faltam " + faltaAnos + " anos");
        }else if (exercito > 100 || exercito < 0) {
        throw new IllegalArgumentException("Ano de nascimento inválido!!!");
        } else{
            JOptionPane.showMessageDialog(null, nome + ", você já passou da idade para se alistar no exército!\n" +
                    "Se passaram " + passaAnos + " anos");
        }
    }
}
