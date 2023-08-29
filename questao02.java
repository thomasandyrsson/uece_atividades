package br.uece.pcc;
import java.util.Scanner;
import java.util.Date;

class Pessoa {
    private String nome; // Define o nome da pessoa
    private String cpf; // Define o cpf da pessoa
    private char sexo;
    private int data; // Define a data de nascimento da pessoa

    
  	  
  	  // Obtem o nome da pessoa
	      public String getNome() {
	          return nome;
	      }
	      
	      // Atribui o nome a pessoa
	      public void setNome(String nome) {
	          this.nome = nome;
	      }

	      // Obtem o cpf da pessoa
	      public String getCpf() {
	    	  return cpf;
	      }
	      
	      // Atribui o cpf a pessoa
	      public void setCpf(String cpf) {
	    	  this.cpf = cpf;
	      }
	      
	      // Obtem o sexo da pessoa;
	      public char getSexo() {
	    	  return sexo;
	      }
	      
	      // Atribui o sexo da pessoa
	      public void setSexo(char sexo) {
	    	  this.sexo = sexo;
	      }

	      // Obtem a data de nascimento da pessoa
	      public int getDate() {
	    	  return data;
	      }

	      // Atribui a data de nascimento a pessoa
	      public void setDate (int data) {
	    	  this.data = data;
	      }
    

	
   
    //Imprimir as informações
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
    }
}
	
	public class questao02 {
	
	
	
		public static void main (String[] args) {
			Scanner entrada = new Scanner (System.in);
		
		System.out.printf("Digite o nome da pessoa: ");
		String nome = entrada.next();
		
		System.out.printf("Digite a sua data de nascimento: ");
		int data = entrada.nextInt();
		
		System.out.printf("Digite seu sexo (M/F): ");
		char sexo = entrada.next().charAt(0);
		
		System.out.printf("Digite seu CPF: ");
		String cpf = entrada.next();
		
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nome);
			pessoa.setCpf(cpf);
			pessoa.setSexo(sexo);
			pessoa.setDate(data);
			
			
			System.out.printf("\nInformações da pessoa: ");
			pessoa.imprimirInformacoes();
			
	}
}