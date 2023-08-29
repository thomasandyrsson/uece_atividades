package br.uece.pcc;
import java.util.concurrent.ThreadLocalRandom;

public class questao01 {
	
		public static void main (String[] args) {
			int colunas = 4, linhas = 8;
		    int[][] matriz = new int [linhas][colunas];
		
		    GeraMatriz(matriz, linhas, colunas);
		    PrintMatriz(matriz, linhas, colunas);
		    
		    System.out.println("");
		    
		    somaNumerica(matriz, linhas, colunas);
		    System.out.println("");
		    menorNum(matriz, linhas, colunas);
		    System.out.println("");
		    somaDiagonal(matriz, linhas, colunas);
			}
		
		
		public static void GeraMatriz (int [][] matriz, int l, int c) {
		    for(int i = 0; i < l; i++) {
		        for(int j = 0; j < c; j++) {
		            matriz[i][j] = ThreadLocalRandom.current().nextInt(0,9);
		        }
		    }
		}

		public static void PrintMatriz (int [][] matriz, int l, int c) {
		    for(int k = 0; k < l; k++) {
		        for(int j = 0; j < c; j++) {
		            System.out.printf("%d | ", matriz[k][j]);
		        }
		        System.out.printf("%n");
		    }
		}
		
		public static void somaNumerica (int [][] matriz, int l, int c){
			int soma = 0;
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < c; j++) {
					soma += matriz[i][j];
				}
			}
			System.out.println("A soma dos números armazenados é: " + soma);
		}
		
		public static void menorNum (int [][] matriz, int l, int c) {
			int menor = matriz[0][0];
				for(int i = 0; i < l; i++) {
					for(int j = 0; j < c; j++) {
						if (matriz[i][j] < menor) {
							menor = matriz[i][j];
						}
					}
				}System.out.printf("O menor número dessa matriz é: " + menor);
		}
		
		public static void somaDiagonal (int [][] matriz, int l, int c) {
			int soma = 0;
				for (int i = 0; i < l; i++) {
					for (int j = 0; j < c; j++) {
						if(i == j) {
							soma += matriz[i][i];
						}
						                                 
					}
				}System.out.printf("A soma da diagonal principal é: " + soma);
		}
		
}
