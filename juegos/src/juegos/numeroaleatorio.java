package Juego;

import java.util.Scanner;

public class numeroaleatorio {

	public static void main(String[] args) {
		
		// Juego adivinar numero
		
		Scanner input = new Scanner(System.in);

		int numeroDado, random;
		random = (int) (Math.random() * 100) + 1;
		
		System.out.println("¡Bienvenido! Este es el juego de números aleatorios.");
		System.out.println("Consiste en adivinar el número, de 1 al 100. La máquina te dirá si el número que has introducido es mayor o menor.");
		
		System.out.println(" ");
		System.out.println("---------------------");
		System.out.println("Introduce un número: ");
		numeroDado = input.nextInt();

		for (int i = 0; i < 100; i++) {
			{
				if (numeroDado == random) {

					System.out.println("¡Felicidades, lo has adivinado! ");
					System.out.println("Lo has encontrado en " + i + " intentos.");
					break;

				} else {

					if (numeroDado <= random) {
						System.out.println("Es mayor");
						System.out.println("Otro número: ");
						numeroDado = input.nextInt();
						i++;

					} else {
						System.out.println("Es menor");
						System.out.println("Otro número: ");
						numeroDado = input.nextInt();
						i++;
					}
				}
			}
		}
		
		// Fin juego adviniar numero > Blanca

	}

}
