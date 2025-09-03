package atividades;
import java.util.Scanner;

public class verificacaoTemperatura {
	public static void main(String[] args) {
		java.util.Scanner previsaoTemp = new Scanner(System.in); /*SCANNER SENDO UTILIZADO PARA DEFINIR A previsaoTemp*/
		
		System.out.println("VERIFICAÇÃO DE TEMPERATURA"); /* PRINT PARA O TITULO DE "VERIFICAÇÃO DE TEMPERATURA"*/
		System.out.println("DIGITE A TEMPERATURA EM C°:"); /*PRINT PARA PODER DIGITAR A TEMPERATURA*/
		
		double temperatura = previsaoTemp.nextDouble();
		
		/*CLASSIFICAÇÃO DA TEMPERATURA*/
		if (temperatura < 18) {
			System.out.println("Está bastante frio");
		}else if (temperatura >= 18 && temperatura <= 25) {
			System.out.println("O clima está bem agradável");
		}else {
			System.out.println("Está muito quente");
		}
		previsaoTemp.close(); /*FECHAMENTO DO SCANNER "previsaoTemp" CRIADO*/
	}
}
