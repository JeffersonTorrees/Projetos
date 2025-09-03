package atividades;
import java.util.Scanner;

public class classificacaoImc {
	public static void main(String[] args) {
		java.util.Scanner massaCorporal = new Scanner(System.in); /*CRIANDO O SCANNER MASSA CORPORAL*/
		
		/*MENU DA CALCULADORA IMC*/
        System.out.println("=== CALCULADORA DE IMC ===");
        System.out.println("Classificação do IMC:");
        System.out.println("- Abaixo do peso: IMC < 18,5");
        System.out.println("- Peso normal: IMC entre 18,5 e 24,9");
        System.out.println("- Sobrepeso: IMC entre 25 e 29,9");
        System.out.println("- Obesidade: IMC ≥ 30");
        System.out.println("--------------------------");
        
        /*SOLICITA O PESE*/
        System.out.print("Digite o peso (kg): ");
        double peso = massaCorporal.nextDouble();
        
        System.out.print("Digite a altura (metros): ");
        double altura = massaCorporal.nextDouble();
        
        /*VALIDA OS DADOS*/
        if (peso <= 0 || altura <= 0) {
        	System.out.println("Erro: Peso e altura devem ser maiores que zero!");
        } else {
        	/*CALCULA IMC*/
        	double imc = calcularIMC(peso, altura);
        	
        	/*CLASSIFICA O IMC*/
        	String classificacao = classificarIMC(imc);
        	
        	/*EXIBE OS RESULTADOS*/
            System.out.println("\n=== RESULTADO ===");
            System.out.printf("Peso: %.2f kg\n", peso);
            System.out.printf("Altura: %.2f m\n", altura);
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Classificação: " + classificacao);
        }
        
        massaCorporal.close();
		
	}
	/*METODO PARA CLASSIFICAR O IMC*/
	public static double calcularIMC(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	/*METODO PARA CLASSIFICAR O IMC*/
	public static String classificarIMC(double imc) {
		if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
	}
}
