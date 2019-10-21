package es.studium.Veces;

import java.util.Scanner;

public class Veces {
	public static void main(String[] args)
	{
		int veces, numero;

		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame el número de veces:");
		veces=teclado.nextInt();

		System.out.println("Dame el número entero:");
		numero=teclado.nextInt();

		for(int i=0; i<veces; i++) 
		{
			System.out.println(numero);
		}
		teclado.close();

	}


}
