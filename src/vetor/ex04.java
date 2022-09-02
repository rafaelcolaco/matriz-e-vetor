package Lista.Lista;
import java.util.Scanner;
public class Exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float soma = 0;
		for (int i=1;i<=4;i++) {
			
			System.out.println("Digite a nota");
			float nota = entrada.nextFloat();
			System.out.println(nota);
			soma = soma +nota;
		}
		System.out.println("A média é "+soma/4);
		entrada.close();
		
		
	}

}
