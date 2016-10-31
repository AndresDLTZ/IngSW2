package ejemploSumaResta;

import java.util.Scanner;
public class ejemploSumaResta {
	public static void main(String[] args) {
		Scanner scnIngreso = new Scanner(System.in);
		int a=0, b=0, r=0;


		System.out.println("Ingrese A: ");
		a=scnIngreso.nextInt();
		System.out.println("Ingrese B: ");
		b=scnIngreso.nextInt();

		if (a>=b){
			r=a-b;
			System.out.println("Hola mundo");
			System.out.println(" R= "+a+" - "+b+" = "+r);
		}
		else
		{
			r=a+b;

			System.out.println(" R= "+a+" + "+b+" = "+r);
			System.out.println(" R= "+a+" + "+b+" = "+r);
		}


	}
}
