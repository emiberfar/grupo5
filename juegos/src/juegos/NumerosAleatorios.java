package juegos;

import java.util.Scanner;


public class numerosaleatorios {

	public static void jugar() {

		/* <h2> Juego adivinar numero </h2>
		 * Esta función escanea, o mejor dicho, registra el número que introduce el usuario (en este caso, pide un número)
		 */
		Scanner input = new Scanner(System.in);

		// Crea un número random que <b>no supere de 100</b>, para luego adivinarlo
		int numeroDado, random;
		random = (int) (Math.random() * 100) + 1;

		/* 
		 * Mensaje de bienvenida, da la <b>descripción del juego</b> al usuario
		 */
		System.out.println("¡Bienvenido! Este es el juego de números aleatorios.");
		System.out.println("Consiste en adivinar el número, de 1 al 100. La máquina te dirá si el número que has introducido es mayor o menor.");

		System.out.println(" ");
		System.out.println("---------------------");
		System.out.println("Introduce un número: ");
		numeroDado = input.nextInt();

		/*
		 * <b>Si el número dado es igual al número random entonces ha acertado</b>
		 * En el <b>caso contrario</b>, sigue intentándolo. El programa <b>dará pistas</b> si es mayor o número el número que 
		 * ha introducido, comparado con el numero random <b>(numeroDado == random)</b>
		 */
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

		/* Fin juego adviniar numero > Blanca
		 * @author @Blanca
		 * @throws SerletException
		 * @throws IOException
		 */

	}

}
