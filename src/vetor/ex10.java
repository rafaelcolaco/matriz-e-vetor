package Lista.Lista;
import java.util.Scanner;
public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		final int cons = 3;
		int vet[] = new int[cons];
		
		System.out.println("Digite  o dia:");
		int dia = entrada.nextInt();
		System.out.println("Digite o Mês:");
		int mes = entrada.nextInt();
		System.out.println("Digite o Ano");
		int ano = entrada.nextInt();
		
		vet[1] = dia;
		vet[2] = mes;
		vet[3]= ano;
		entrada.close();
	}

}
