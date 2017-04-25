package juegos;

import java.util.Scanner;

public class NumerosAleatorios {

	public static void jugar() {

		//<h2> Juego adivinar numero </h2>
		/*
		 * @param Scanner
		 * Esta función hace <b>escanear el número</b> introducido por el usuario
		 */

		Scanner input = new Scanner(System.in);

		/* 
		 * @param random
		 * Crea un número random (aleatorio) que <b>no supere de 100</b>, para luego adivinarlo
		 * Sumamos 1 para que de 100, en vez de 99 (ya que cuenta el 0 como número)
		 * 
		 * <b>numeroDado</b> = numero introducido por el usuario
		 */
		int numeroDado, random;
		random = (int) (Math.random() * 100) + 1;

		/* 
		 * @param syso
		 * Mensaje de bienvenida, da la <b>descripción del juego</b> al usuario
		 */
		System.out.println("¡Bienvenido! Este es el juego de números aleatorios.");
		System.out.println("Consiste en adivinar el número, de 1 al 100. La máquina te dirá si el número que has introducido es mayor o menor.");

		System.out.println(" ");
		System.out.println("---------------------");
		System.out.println("Introduce un número: ");
		
		/*
		 * @param input.nextInt();
		 * Guarda el número (tipo int) que ha introducido el usuario
		 */
		numeroDado = input.nextInt();

		/*
		 * @param for
		 * 
		 * Esta función hace un bucle para comprobar <b>si el número dado es igual al número random = entonces ha acertado</b>
		 * En el <b>caso contrario</b>, sigue intentándolo. 
		 * 
		 * El programa <b>dará pistas</b> si es mayor o número el número que 
		 * ha introducido, comparado con el numero random <b>(numeroDado == random)</b>
		 */
		for (int i = 0; i < 100; i++) {
			{
				/*
				 * @param if, syso
				 * En el caso que <b>acierte el número random</b>, dará este mensaje
				 */
				if (numeroDado == random) {
					
					System.out.println("¡Felicidades, lo has adivinado! ");
					System.out.println("Lo has encontrado en " + i + " intentos.");
					break;
					
					/*
					 * @param else
					 * Indica que el <b>número random es mayor</b>
					 */
				} else {

					if (numeroDado <= random) {
						System.out.println("Es mayor");
						System.out.println("Otro número: ");
						numeroDado = input.nextInt();
						i++;
						
						/*
						 * @param else
						 * Indica que el <b>número random es menor</b>
						 */
					} else {
						
						System.out.println("Es menor");
						System.out.println("Otro número: ");
						numeroDado = input.nextInt();
						i++;
					}
				}
			}
		}

		/* Fin juego adviniar numero, finaliza el programa
		 * 
		 * @author @Blanca
		 * @version 1.06
		 * @since 1.00
		 * @throws SerletException
		 * @throws IOException
		 */

	}

}
