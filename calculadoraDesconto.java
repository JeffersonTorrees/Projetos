package atividades;
import java.util.Scanner;

public class calculadoraDesconto {
	public static void main(String[] args) {
		java.util.Scanner calcularDesconto = new Scanner(System.in);
		
		/*MENU DA CALCULADORA*/
        System.out.println("=== CALCULADORA DE DESCONTO ===");
        System.out.println("Formas de pagamento e descontos:");
        System.out.println("1. Dinheiro - 10% de desconto");
        System.out.println("2. Cartão à vista - 5% de desconto");
        System.out.println("3. Cartão parcelado - Sem desconto");
        System.out.println("-------------------------------");
        
        /*SOLICITA O VALOR DA COMPRA*/
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = calcularDesconto.nextDouble();
        
        /*EXIBE OPÇÕES DE PAGAMENTO*/
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão à vista");
        System.out.println("3 - Cartão parcelado");
        System.out.print("Opção: ");
        
        int opcao = calcularDesconto.nextInt();
        
        /*VALIDA OS DADOS*/
        if (valorCompra <= 0) {
        	System.out.println("Erro: O valor da compra deve ser maior que zero!");
        }else if (opcao < 1 || opcao > 3) {
        	System.out.println("Erro: opção de pagamento invalida!");
        }else {
        	/*CALCULA O DESCONTO E VALOR FINAL*/
        	double desconto = calcularDesconto(valorCompra, opcao);
        	double valorFinal = valorCompra - desconto;
        	String formaPagamento = getFormaPagamento(opcao);
        	
        	/*EXIBE OS RESULTADOS*/
            System.out.println("\n=== RESUMO DA COMPRA ===");
            System.out.printf("Valor da compra: R$ %.2f\n", valorCompra);
            System.out.println("Forma de pagamento: " + formaPagamento);
            System.out.printf("Desconto aplicado: R$ %.2f\n", desconto);
            System.out.printf("Valor final: R$ %.2f\n", valorFinal);
        }
        calcularDesconto.close();
        
	}
	/*METODO PARA CALCULAR O DESCONTO*/
	public static double calcularDesconto(double valorCompra, int opcao) {
		switch (opcao) {
		case 1: // DINHEIRO - 10% DE DESCONTO
			return valorCompra *0.10;
		case 2: //CARTÃO À VISTA - 5% DE DESCONTO
			return valorCompra * 0.05;
		case 3: //CARTÃO PARCELADO - SEM DESCONTO
			return 0;
			default:
				return 0;
		}
	}
	/*METODDO PARA OBTER A DESCRIÇÃO DA FORMA DE PAGAMENTO*/
	public static String getFormaPagamento(int opcao) {
		switch (opcao) {
		case 1: return "Dinheiro (10% de desconto)";
		case 2: return "Cartão à vista (5% de desconto)";
		case 3: return "Cartão parcelado (Sem desconto)";
		default: return "Forma de pagamento invalida";
		}
	}
}
