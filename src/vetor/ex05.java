package Lista.Lista;
import java.util.Scanner;
public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int TAM = 20;
		
		int vet[] = new int [TAM];
		int par[] = new int [TAM];
		int impar[] = new int [TAM];
		
		for(int i=0; i<TAM; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = entrada.nextInt();
		}
		
		for(int i=0; i<TAM; i++) {
			if((vet[i] %2)==0) {
				par[i] = vet[i];
			}
			else
				impar[i] = vet[i];
		}
		
		for(int i=0; i<TAM; i++)
			System.out.print(vet[i] +" | ");
		
		System.out.println("");
		System.out.println("Pares");
		
		for(int i=0; i<TAM; i++)
			System.out.print(par[i]+ " | ");
		
		System.out.println("");
		System.out.println("Impares");
		
		for(int i=0; i<TAM; i++)
			System.out.print(impar[i]+" | ");
		
		entrada.close();	
	}
}
