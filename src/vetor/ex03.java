package Lista.Lista;

import java.util.Random;
public class Exerc03 {

	public static void main(String[] args) {
		/*Faça um Programa que leia um vetor de N (constante) números inteiros e apresente as
		seguiintes informações, soma, média, maior, menor, pares, ímpares, números acima da
		média e números abaixo da média.*/ 

		
		Random generator =  new Random();
		
		final int TAM = 5;
		final int LIMIT = 5;
		float soma = 0;
		float menor = 0;
		float  maior = 0;
		int numeromaior=0;
		int numeromenor=0;
		int pares = 0;
		int impares = 0;
		
		int [] vet = new int[TAM];
		
		for(int i=0;i<TAM;i++) {
			vet[i]=generator.nextInt(LIMIT);
			soma = soma+ vet[i];
			if(i==0) {
				menor= vet[1];
				maior= vet[1];
			}
			else {
				if (vet[i-1]<menor)
					menor = vet[i];
				
				else if(vet[i-1]>maior)
					maior= vet [i];
			}
			
			
			if((vet[i]%2)==0)
				pares = pares+1;
			else
				impares = impares+1;
			
			soma = soma +vet[i];
		}
		float media = soma/TAM;
		
		for(int i=0;i<TAM;i++) {
			
			if(vet[i]>media)
				 numeromaior= numeromaior+1;
			else
				numeromenor=numeromenor+1;
			
			System.out.println(vet[i]);
			
		}
		System.out.println("soma= "+soma);
		System.out.println("numeros maiores que a media= "+numeromaior);
		System.out.println("media= "+media);
		System.out.println("numeros menores que a média= "+numeromenor);
		System.out.println("o maior numero é "+maior);
		System.out.println("o menor numero é "+menor);
		System.out.println("impares= "+impares);
		System.out.println("pares= "+pares);
		
	}

}
