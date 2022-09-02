package Lista.Lista;

import java.util.Random;

public class Exerc08 {

	public static void main(String[] args) {
	/*Faça um Programa que leia um vetor de 5 números inteiros, 
	* mostre a soma, a multiplicação e os números.*/

Random generator =  new Random();
		
		final int TAM = 5;
		final int LIMIT = 5;
		
		
		int [] vet = new int [TAM];
		float  soma = 0;
		 float multi=1;
		
		
		for(int i=0;i<TAM;i++) {
			vet[i]=generator.nextInt(LIMIT);
			soma = vet[i]+soma;
			multi = multi*vet[i]; 
		}
		
			
		System.out.println("Numeros= ");
		for(int i=0;i<TAM;i++)
			System.out.println(vet[i]);
		
		System.out.println("Soma= "+ soma);
		System.out.println("Multiplicação= "+ multi);
		
		
		
	}

}
