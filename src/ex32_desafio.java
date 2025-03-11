/*
*****32*****
[DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5
o jogador vai tentar descobrir qual foi o valor sorteado.
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class ex32_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Fazer o computador escolher um número aleatório entre 1 e 5
        2 - Pedir ao usuário para escolher um número
        3 - Comparar ambos os números, se o jogador tiver escolhido o mesmo número do computador ele ganha um ponto
        4 - Após 5 rodadas, imprimir a quantidade de pontos que o jogador fez, se fez mais de 3 pontos ele ganha
        """.stripIndent());

        JOptionPane.showMessageDialog(null, """
                Bem-vindo ao Jogo da Sorte!
                O computador escolherá um número aleatório entre 1 a 5, seu dever é escolher o mesmo número com ele.
                Após 5 rodadas se você escolher 3 ou mais números corretos, você ganha o jogo. Boa sorte!""".stripIndent());

        int rodadas = 0;
        int pontos = 0;
        while (rodadas < 5) {
            try{
                Random computador = new Random();
                int escolhaComputador = computador.nextInt(5) + 1;

                int numPlayer = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 5: "));
                if(numPlayer > 5 || numPlayer < 1){
                    throw new IllegalArgumentException("Você digitou: " +  numPlayer + "\n" +
                            "O valor deve ser entre 1 e 5!\n" +
                            "Digite novamente.");
                    }else if(numPlayer == escolhaComputador){

                    JOptionPane.showMessageDialog(null, "Que sorte! Você acertou o número!\n" +
                            "Seu número escolhido: " + numPlayer + "  ----->  Número do computador: " + escolhaComputador + "\n" +
                            "Pontuação: " + (pontos+=1));
                    rodadas++;
                }else{
                    JOptionPane.showMessageDialog(null, "Que pena! Você errou o número!\n" +
                            "Seu número escolhido: " + numPlayer + "  ----->  Número do computador: " + escolhaComputador + "\n" +
                            "Pontuação: " + (pontos));
                    rodadas++;
                }
            }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 5: ");
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }


        }
        if(pontos >= 3){
            JOptionPane.showMessageDialog(null, "Parabéns você ganhou o jogo! Que sorte!!!\n" +
                    "Pontuação Final: " + pontos);
        }else{
            JOptionPane.showMessageDialog(null, "Que pena, você perdeu! Mais sorte da próxima vez!!!\n" +
                    "Pontuação Final: " + pontos);
        }


    }
}
