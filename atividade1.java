package atividades;
import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		
		/*java.util.Scanner grausCelsios = new java.util.Scanner(System.in);
		
		System.out.println("Informe quantos Graus Celsios está:  ");
		
		int graus = grausCelsios.nextInt();
		
		if (graus < 0) {
			System.out.println("Congelante");
		} else if (graus < 15) {
			System.out.println("Frio");
		}else if (graus < 25) {
			System.out.println("Agradavel");
		}else {
			System.out.println("Quente");
		}*/
			
	/*java.util.Scanner CriacaIdade = new java.util.Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	
	int idade = CriacaIdade.nextInt();
	
	if (idade < 12) {
		System.out.println("Criança");
	}else if (idade < 17) {
		System.out.println("Adolecente");
	}else if (idade < 59) {
		System.out.println("Adulto");
	}else {
		System.out.println("Idoso");
	}*/
	
	/*java.util.Scanner DescontoValor = new java.util.Scanner(System.in);
	
	System.out.println("Digite o valor da compra: RS: ");
	double valor = DescontoValor.nextDouble();
	
	double desconto = 0;
	
	if(valor >= 500) {
		desconto = valor * 0.20;
	}else if (valor >= 200) {
		desconto = valor * 0.10;
	}
	
	double valorFinal = valor - desconto;
	
	System.out.println("Valor final com desconto: R$: "+ (valorFinal));
	
	
	}*/
	
	/*java.util.Scanner Calculador = new java.util.Scanner(System.in);
	
	System.out.println("Digite o primeiro número: ");
	double num1 = Calculador.nextDouble();
	
	System.out.println("Digite o segundo número: ");
	double num2 = Calculador.nextDouble();
	
	System.out.println("Escolha a operação 1-soma, 2-subtração, 3-multiplicação, 4-divisão:");
	
	int opcao = Calculador.nextInt();
	
	double resultado;
	String operacao;
	
	
	if(opcao == 1) {
		resultado = num1 + num2;
		operacao = "Soma";
		System.out.println("Resultado: " + operacao + resultado);
		
	} else if (opcao == 2) {
		resultado = num1 - num2;
		operacao = "Subtração";
		System.out.println("Resultado: " + operacao + resultado);
		
	}else if (opcao == 3) {
		resultado = num1 * num2;
		operacao = "Multiplicação";
		System.out.println("Resultado: " + operacao + resultado);
		
	}else if (opcao == 4) {
		if (num2 != 0) {
			resultado = num1 / num2;
			operacao = "Divisão";
			System.out.println("Resultado: " + operacao + resultado);
			
		}else {
			System.out.println("Erro - Não possivel dividor numero em zero!");
			
		}
	}else {
		System.out.println("Opcão errada! Digite um numero de 1 a 4 igual nas opções");
		
	}*/
	
	
	java.util.Scanner Cadastro = new java.util.Scanner(System.in);
	
	System.out.println("Digite seu Login:");
	String login = Cadastro.nextLine();
	
	System.out.println("digite sua senha: ");
	String senha = Cadastro.nextLine();
	
	if (login.equals("admin") && senha.equals("1234")) {
		System.out.println("Acesso permitido");
	}else {
		System.out.println("Acesso Negado");
	}
	
	
	}
	
}
	


