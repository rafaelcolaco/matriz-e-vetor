package Lista.Lista;
import java.util.Scanner;
public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra;
		
		
		System.out.print("Digite uma palavra: ");
		palavra = entrada.nextLine();
		int CONT = palavra.length();
		String vet[] = new String[CONT];
		
		for(int i=0; i<CONT;i++) 
			vet[i] = palavra.substring(i);
		
		for(int j=0; j<CONT;j++)
			System.out.println(vet[j]);
		
		entrada.close();
		
	}

}
