package Lista.Lista;

import java.util.Random;

public class Exerc06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fa�a um Programa que leia 20 n�meros inteiros e armazene-os num vetor. Armazene os
	n�meros pares no vetor PAR e os n�meros IMPARES no vetor impar. Imprima os tr�s
	vetores.*/
			
			
				
			
				Random generator =  new Random();
				
				final int TAM = 20;
				final int LIMIT = 20;
				
				
				
				
				int [] vet = new int[TAM];
				int [] par = new int [TAM];
				int [] impar = new int [TAM];
				
				
				for(int i=0;i<TAM;i++) {
					vet[i]=generator.nextInt(LIMIT);
				}
				
				for(int i=0;i<TAM;i++) {
					if((vet[i]%2)==0)
						par[i] = vet[i];
					
					else
						impar[i] = vet[i];
					
				}
				System.out.println("Numeros= ");
				for(int i=0;i<TAM;i++) 
					System.out.println(vet[i]);
					
				
				System.out.print("Pares= ");
				for(int i=0;i<TAM;i++)
					System.out.println(par[i]);
					
				System.out.println("Impares= ");
				for(int i=0;i<TAM;i++)
					System.out.println(+impar[i]);
					
					
				
	}

}

