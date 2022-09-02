				package Lista.Lista;
import java.util.Scanner;
public class Exerc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in); 
	
		
		final int cont1= 5;
			
		String[] vet1 = new String  [cont1];
		int[] vet2 = new int  [cont1];
		float[] vet3 = new float  [cont1];
		
		for(int i =0;i<cont1;i++) {
			entrada.nextLine();
			System.out.print("Digite o Nome da Pessoa: ");
			vet1[i] = entrada.nextLine();
			
			System.out.print("Digite a idade");
			vet2[i]= entrada.nextInt();
			
			System.out.print("Digite a Altura");
			vet3[i]= entrada.nextFloat();
		}
		
		for(int i = cont1; i>0;i--) {
			System.out.print(vet1[i]+" | ");
		}
		System.out.println("");
		for(int j=cont1; j>0;j--) {
			System.out.print(vet2[j]+" | ");
		}
		System.out.println("");
		for(int k=cont1;k>0;k--) {
			System.out.println(vet3[k]+" | ");
		}
		entrada.close();
			
		
		
	}
	

}
