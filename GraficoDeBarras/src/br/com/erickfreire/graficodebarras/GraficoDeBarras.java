package br.com.erickfreire.graficodebarras;

/**
 * Programa em Java que desenha um gráfico de barras com base em um vetor com notas de alunos
 * @author Erick Freire
 * @version 1 - Criado em 23-05-2021 as 15:22
 */

public class GraficoDeBarras {

	public static void main(String[] args) {
		
		int[] vetor = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Distribuição de Notas: ");
		
		for(int contador = 0; contador < vetor.length; contador++) {
			
			if(contador == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
			
			for(int asteriscos = 0; asteriscos < vetor[contador]; asteriscos++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		

	}

}
