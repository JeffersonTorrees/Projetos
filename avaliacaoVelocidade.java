package atividades;
import java.util.Scanner;

public class avaliacaoVelocidade {
	public static void main(String[] args) {
		java.util.Scanner moniToramento = new Scanner(System.in); /*SCANNER CRIADO MONITORAMENTO*/
		
		/*CLASSIFICAÇÃO DO MENU INICIAL*/
		System.out.println("=== SISTEMA DE MONITORAMENTO DE TRÂNSITO ===");
        System.out.println("Classificação de velocidade:");
        System.out.println("- Lento: menor que 40 km/h");
        System.out.println("- Normal: entre 40 km/h e 80 km/h");
        System.out.println("- Rápido: maior que 80 km/h");
        System.out.println("-------------------------------------------");
		
		System.out.println("Digite a velocidade do veículo (km/h): "); /*print utilizado para digitar a velocidade*/
		double velocidade = moniToramento.nextDouble();
		
		/*CLASSIFICAÇÃO DA VELOCIDADE PERCORRIDA*/
		String categoria;
		if (velocidade < 40) {
			categoria = "Lento";
		} else if (velocidade <= 80) {
			categoria = "Normal";
		} else {
			categoria = "Rápido";
		}
		
		System.out.printf("Velocidade: %.1f km/h\n", velocidade);
		System.out.println("Categoria:" + categoria);
		
		moniToramento.close(); /*FECHAMENTO DO SCANNER NOMEADO*/
		
	}
}
