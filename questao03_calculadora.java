package br.uece.pcc;
import java.util.Scanner;

public class questao03_calculadora{
	
	public static void main(String[] args) {
		
		Scanner opcao = new Scanner(System.in); // Scanner
		
		System.out.println("CALCULADORA"); // Tela de abertura
		
		System.out.printf("1 - SOMA %n2 - SUBTRAÇÃO%n3 - MULTIPLICAÇÃO%n4 - DIVISÃO%n");
		System.out.printf("\nO que deseja fazer? "); // Opções de calculadora
		
		menu(); // Menu interativo
		
		}
	
	public static void adicao(){ // Programa da soma
		Scanner valor = new Scanner (System.in);  // Chamada da entrada
		
		System.out.printf("CALC: FUNÇÃO SOMAR %n");
		
		System.out.printf("Forneça dois números para a soma: \n"); // Texto interativo
		System.out.printf("Primeiro número: "); // Atribuição do primeiro valor
		int num1 = valor.nextInt(); // Atribuição do primeiro valor
		System.out.printf("Segundo número: ");
		int num2 = valor.nextInt();
		int resultado = num1 + num2;
		System.out.printf("O resultado da soma é %d", resultado);
		
	}
	
	public static void subtracao() { // Programa da subtração
		Scanner valor = new Scanner (System.in);
		
		System.out.printf("CALC: FUNÇÃO SUBTRAIR %n");
		
		System.out.printf("Forneça dois números para o cálculo: \n"); // Texto interativo
		System.out.printf("Primeiro número: "); // Atribuição do primeiro valor
		int num1 = valor.nextInt(); // Atribuição do primeiro valor
		System.out.printf("Segundo número: ");
		int num2 = valor.nextInt();
		int resultado = num1 - num2;
		System.out.printf("O resultado desta subtração é %d", resultado);
		
	}
	
	public static void multiplicacao() { // Programa da multiplicação
		Scanner valor = new Scanner (System.in);
		
		System.out.printf("CALC: FUNÇÃO MULTIPLICAR %n");
		
		System.out.printf("Forneça dois números para o cálculo: \n");
		System.out.printf("Primeiro número: "); // Atribuição do primeiro valor
		
		int num1 = valor.nextInt(); //Atribuição do primeiro valor
		
		System.out.printf("Segundo número: ");
		
		int num2 = valor.nextInt();
		int resultado = num1 * num2;
		
		System.out.printf("O resultado deste cálculo é %d", resultado);
	}
	
	public static void divisao() {
		Scanner valor = new Scanner (System.in);
		
		System.out.printf("CALC: FUNÇÃO DIVIDIR %n");
		
		System.out.printf("Forneça dois números para o cálculo: \n");
		System.out.printf("Primeiro número: "); // Atribuição do primeiro valor
		
		int num1 = valor.nextInt();
		
		System.out.printf("Segundo número: ");
		
		int num2 = valor.nextInt();
		int resultado = num1 / num2;
		
		System.out.printf("O resultado deste cálculo é %d", resultado);
	}
	
	public static void menu() {
		Scanner opcao = new Scanner(System.in);
		int escolha = opcao.nextInt();
		
		switch(escolha) {
			case 1:
				System.out.printf("%n");
				adicao();
				break;
				
			case 2:
				System.out.printf("%n");
				subtracao();
				break;
				
			case 3:
				System.out.printf("%n");
				multiplicacao();
				break;
				
			case 4:
				System.out.printf("%n");
				divisao();
				break;
				
			default:
				System.out.printf("OPÇÃO INDISPONÍVEL. DIGITE APENAS NÚMEROS DE 1 A 4 %n");
								
		}
		
	}
	
	
		
					
			
		}

