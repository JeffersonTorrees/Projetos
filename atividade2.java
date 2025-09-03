package atividades;
import javax.swing.JOptionPane;


public class atividade2 {
	public static void main(String[] agrs) {
		
		int num1, num2, resultado;
		int opcao;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero", JOptionPane.QUESTION_MESSAGE));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero", JOptionPane.QUESTION_MESSAGE));
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma das opções: \n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão", JOptionPane.QUESTION_MESSAGE));
		
		
		switch (opcao) {
		case 1:
			resultado = num1 + num2;
			System.out.printf("%d + %d = %d", num1, num2, resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.printf("%d - %d = %d", num1, num2, resultado);			
			break;
		case 3:
			resultado = num1 * num2;
			System.out.printf("%d * %d = %d", num1, num2, resultado);
		case 4:
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.printf("%d / %d = %d", num1, num2, resultado);
			}else {
				System.out.println("Erro");
			}
			default: {
				System.out.println("Opção invalida, tente novamente");
			}
		}
	}
}