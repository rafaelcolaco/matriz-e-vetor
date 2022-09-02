package Lista.Lista;
import java.util.Random; 
public class Exerc14 {

	public static void main(String[] args) {
/*14. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
outros vetores.*/
	final int TAM = 10;	
	final int LIMIT = 10;
	final int LI20 = 20;
	Random gerador = new Random(); 
		
	int [] vet = new int [TAM];
	int [] vet2 = new int [TAM];
	int [] li20 = new int [LI20];
	
	for(int i=0;i<TAM;i++) 
		vet[i]=gerador.nextInt(LIMIT);
	for(int i=0;i<TAM;i++) 
		vet2[i]=gerador.nextInt(LIMIT);
	
	for(int i=0;i<10;i++) 
		li20[i]=vet[i];
	for(int i=10;i<LI20;i++) 
		li20[i]=vet [i-10];

	
	
	for(int i=0;i<LI20;i++)
		System.out.print(li20[i]+"|");
	
	
	
	
	}
	
	
}


