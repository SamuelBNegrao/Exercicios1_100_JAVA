/*
*****55*****
[DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de agora, o computador vai sortear um número entre
1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class ex55_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
        Algoritmo:
        1 - Fazer o computador escolher um número aleatório entre 1 e 10
        2 - Pedir ao usuário para escolher um número
        3 - Comparar ambos os números, se o jogador tiver escolhido o mesmo número do computador ele ganha
        4 - Após 4 rodadas, se o jogdor não tiver acertado ele perde o jogo
        """.stripIndent());

        JOptionPane.showMessageDialog(null, """
                Bem-vindo ao Jogo da Sorte!
                O computador escolherá um número aleatório entre 1 a 10, seu dever é escolher o mesmo número com ele.
                Após 4 rodadas se você escolher 2 ou mais números corretos, você ganha o jogo. Boa sorte!""".stripIndent());

        int rodadas = 0;
        Random computador = new Random();
        int escolhaComputador = computador.nextInt(10) + 1;
        while (rodadas < 4) {
            try{
                int numPlayer = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 10: "));
                if(numPlayer > 10 || numPlayer < 1){
                    throw new IllegalArgumentException("Você digitou: " +  numPlayer + "\n" +
                            "O valor deve ser entre 1 e 10!\n" +
                            "Digite novamente.");
                }else if(numPlayer == escolhaComputador){

                    JOptionPane.showMessageDialog(null, "Que sorte! Você acertou o número e ganhou o jogo!!!\n" +
                            "Seu número escolhido: " + numPlayer +"  ----->  Número do computador: " + escolhaComputador);
                        break;

                }else{
                    JOptionPane.showMessageDialog(null, "Que pena! Você errou o número!\n" +
                            "Seu número escolhido: " + numPlayer);
                    rodadas++;
                }
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 10: ");
            }catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
        if(rodadas == 4) {
            JOptionPane.showMessageDialog(null, "Que pena, você perdeu! Mais sorte da próxima vez!!!\n" +
                                                                        "O número era: " + escolhaComputador);
        }



    }

}