package atividades;
import java.util.Scanner;

public class tipoTriangulo {
	public static void main(String[] args) {
		java.util.Scanner triangulo = new Scanner(System.in); /*DEFININDO O SCANNER PARA O USO*/
		
		/*CLASSIFICANDO O MENU*/
        System.out.println("=== CLASSIFICADOR DE TRIÂNGULOS ===");
        System.out.println("Tipos de triângulo:");
        System.out.println("- Equilátero: todos os lados iguais");
        System.out.println("- Isósceles: dois lados iguais");
        System.out.println("- Escaleno: todos os lados diferentes");
        System.out.println("-----------------------------------");
        
        /*SOLICITA OS TRES LADOS DO TRIANGULO*/
        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = triangulo.nextDouble();
        
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = triangulo.nextDouble();
        
        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = triangulo.nextDouble();
        
        /*VERIFICA SE OS LADOS FORMAM UM TRIANGULO VALIDO*/
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
        	System.out.println("Erro: Todos os lados devem ser maiores que zero!");
        } else if (!formaTriangulo(lado1, lado2, lado3)) {
        	System.out.println("Erro: Os lados fornecidos não formam um triângulo!");
            System.out.println("A soma de quaisquer dois lados deve ser maior que o terceiro lado.");
        }else {
        	/*CLASSIFICA O TRIANGULO*/
        	String tipo = classificarTriangulo(lado1, lado2, lado3);
            System.out.printf("Lados: %.2f, %.2f, %.2f\n", lado1, lado2, lado3);
            System.out.println("Tipo do triângulo: " + tipo);
        }
        triangulo.close();
	}
	/*METODO PARA VERIFICAR SE OS LADOS FORMAM UM TRIANGULO VALIDO*/
	public static boolean formaTriangulo(double a, double b, double c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}
	
	/*METODO PARA CLASSIFICAR O TIPO DE TRIANGULO*/
	public static String classificarTriangulo(double a, double b, double c) {
		if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
            
	}
	}
}
