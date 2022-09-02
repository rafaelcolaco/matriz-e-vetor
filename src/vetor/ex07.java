package Lista.Lista;

import java.util.Random;

public class Exerc07 {
	/*Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
	média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator =  new Random();
		
		final int TAM = 10;
		final int LIMIT = 10;
		
		
		
		
		
		float [] nota1 = new float [TAM];
		float [] nota2 = new float [TAM];
		float [] media = new float [TAM];
		float [] nota3 = new float [TAM];
		float [] nota4 = new float [TAM];
		int conta = 0;
		
		
		for(int i=0;i<TAM;i++) {
			nota1[i]=generator.nextInt(LIMIT);
		}
		
		for(int i=0;i<TAM;i++) {
			nota2[i]=generator.nextInt(LIMIT);
		}		
					
		for(int i=0;i<TAM;i++) 
			nota3[i]=generator.nextInt(LIMIT);
		
		for(int i=0;i<TAM;i++) 
			nota4[i]=generator.nextInt(LIMIT);
			
		for(int i=0;i<TAM;i++)
			media[i]= ((nota1[i]+nota2[i]+nota3[i]+nota4[i])/4); 
		
			
		System.out.println("Nota1= ");
		for(int i=0;i<TAM;i++)
			System.out.println(nota1[i]);
		
		System.out.println("Nota2= ");
		for(int i=0;i<TAM;i++)
			System.out.println(nota2[i]);
	
		System.out.println("Nota3= ");
		for(int i=0;i<TAM;i++)
			System.out.println(nota3[i]);
		
		System.out.println("Nota4= ");
		for(int i=0;i<TAM;i++)
			System.out.println(nota4[i]);
		
		for(int i=0;i<TAM;i++) {
			if (media[i]>=7)
				conta = conta +1;
		}	
		
		System.out.println("Numero de Alunos com media maior que 7.0: "+conta);
		
	}
	

}
