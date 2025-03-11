/*
*****31*****
[DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
import javax.swing.*;
import java.util.Random;
public class ex31_desafio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Dar a opção para o usuário escolher entre Pedra, papel e tesoura\n" +
                "2 - Fazer um boolean verdadeiro dependendo da escolha do usuário \n" +
                "3 - O computador sorteia uma das três opções e compara com a do usuário\n" +
                "4 - Dependendo do resultado, o vencedor ganha um ponto que é armazenado em uma variável contadora\n" +
                "5 - Caso o resultado seja um empate, a variável contadora não sofre mudança\n" +
                "6 - Após 3 rodadas, o jogo acaba, imprimindo quem foi o vencedor dependendo da quantidade de pontos");

        JOptionPane.showMessageDialog(null, "Bem-vindo ao Jokenpo!\n" +
                "Escolha entre Pedra, Papel ou Tesoura. Seu objetivo é marcar mais pontos que o computador.\n" +
                "Ao final de 3 rodadas, quem tiver mais pontos ganha. Boa sorte!");
        //Seta as variáveis e o loop do jogo
        int player = 0;
        int pc = 0;
        int rodadas = 0;
        while(rodadas < 3) {
            boolean pedra = false;
            boolean papel = false;
            boolean tesoura = false;

            String[] lista = {"Pedra", "Papel", "Tesoura"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha um:", "Jokenpo",
                    0, 3, null, lista, lista[0]);
            if (escolha == 0) { //Muda os booleans para verdadeiro dependendo da escolha do jogador
                pedra = true;
            }else if (escolha == 1) {
                papel = true;
            }else{
                tesoura = true;
            }
            //Faz o computador escolher um número aleatório e analisa para ver quem ganha
            Random computador = new Random();
            int escolhaComputador = computador.nextInt(3);
            JOptionPane.showMessageDialog(null, "O computador escolheu: " + lista[escolhaComputador]);

            if(escolhaComputador == 0 && tesoura) {
                JOptionPane.showMessageDialog(null, "Você perdeu essa rodada!\n" +
                        "Jogador "+ player + "   X   Computador " + (pc+=1));
                rodadas++;
            }else if(escolhaComputador == 0 && papel) {
                JOptionPane.showMessageDialog(null, "Você ganhou essa rodada!\n" +
                        "Jogador " + (player+=1) + "   X   Computador "+ (pc));
                rodadas++;
            }else if(escolhaComputador == 1 && pedra) {
                JOptionPane.showMessageDialog(null, "Você perdeu essa rodada!\n" +
                        "Jogador " + player + "   X   Computador " + (pc+=1));
                rodadas++;
            }else if(escolhaComputador == 1 && tesoura) {
                JOptionPane.showMessageDialog(null, "Você ganhou essa rodada!\n" +
                        "Jogador " + (player+=1) + "   X   Computador " + (pc));
                rodadas++;
            }else if(escolhaComputador == 2 && papel) {
                JOptionPane.showMessageDialog(null, "Você perdeu essa rodada!\n" +
                        "Jogador " + player + "   X   Computador " + (pc+=1));
                rodadas++;
            }else if(escolhaComputador == 2 && pedra) {
                JOptionPane.showMessageDialog(null, "Você ganhou essa rodada!\n" +
                        "Jogador " + (player+=1) + "   X   Computador " + (pc));
                rodadas++;
            }else{
                JOptionPane.showMessageDialog(null, "Empate! Jogue novamente!");
            }
        }
        //Compara as pontuações e imprime quem foi o vencedor do jogo
        if(player > pc){
            JOptionPane.showMessageDialog(null, "Você ganhou o jogo, parabéns!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Você perdeu o jogo, que pena...");
        }
    }
}