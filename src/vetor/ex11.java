package Lista.Lista;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
/*11. Fa�a um programa que pe�a uma data no padr�o dd/mm/aaaa, valide esta data e coloque
cada item em uma posi��o de um vetor de inteiros de tamanho 3.*/

Scanner entrada =  new Scanner(System.in);
					
final int TAM = 3;
					
					
					
					
int [] vet = new int [TAM];

System.out.println("Digite o dia");
int dia = entrada.nextInt();
System.out.println("Digite o m�s");
int mes = entrada.nextInt();
System.out.println("Digite o ano");
int ano = entrada.nextInt();

					
if (dia>0 && dia<32)
	vet[0]= dia;

if (mes>0 && mes<13)
	vet[1]= mes;

 if (ano<2022)
	vet[2]= ano;
					
System.out.println(vet[0]+"/"+vet[1]+"/"+vet[2]);						
entrada.close();				
	}

}
