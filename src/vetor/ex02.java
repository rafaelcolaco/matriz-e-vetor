
package Lista.Lista;


import java.util.Random;
public class Exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator =  new Random();
		
		final int TAM = 10;
		final int LIMIT = 10;
	
		
		
		float [] vet = new float[TAM];
		
		for(int i=0;i<TAM;i++) {
			vet[i]=generator.nextInt(LIMIT);
			
	}
		System.out.print(vet[9]+"|");
		System.out.print(vet[8]+"|");
		System.out.print(vet[7]+"|");
		System.out.print(vet[6]+"|");
		System.out.print(vet[5]+"|");
		System.out.print(vet[4]+"|");
		System.out.print(vet[3]+"|");
		System.out.print(vet[2]+"|");
		System.out.print(vet[1]+"|");
		System.out.print(vet[0]+"|");
		
		
		
		
	}
}