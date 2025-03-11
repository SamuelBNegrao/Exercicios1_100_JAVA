/*
*****27*****
Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final,
de acordo com a média atingida:
• Média até 4.9: REPROVADO
• Média entre 5.0 e 6.9: RECUPERAÇÃO
• Média 7.0 ou superior: APROVADO
 */
import javax.swing.JOptionPane;
public class ex27 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo:\n" +
                "1 - Solicitar do usuário 2 notas\n" +
                "2 - Fazer a soma delas e dividir por 2\n" +
                "3 - Se o resultado for menor ou igual a 4.9 imprimir REPROVADO\n" +
                "4 - Se o resultado for entre 5.0 e 6.9 imprimir RECUPERAÇÃO \n" +
                "5 - Caso a méida for 7.0 ou superior, imprimir APROVADO");
        try {
            float notaA = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
            float notaB = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
            double media = (notaA + notaB) / 2;
            if (notaA < 0 || notaB < 0) {
                throw new IllegalArgumentException("Valor não pode ser negativo!");
            }
            if (media <= 4.9) {
                JOptionPane.showMessageDialog(null, "Aluno REPROVADO!\n"+
                                                                            "Média: " + media);
            }else if(media > 4.9 && media <= 6.9) {
                JOptionPane.showMessageDialog(null, "Aluno de RECUPERAÇÃO\n"+
                                                                            "Média: " + media);
            }else{
                JOptionPane.showMessageDialog(null, "Aluno APROVADO!\n"+
                                                                            "Média: " + media);
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor não pode ser negativo!");
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
    }
}
