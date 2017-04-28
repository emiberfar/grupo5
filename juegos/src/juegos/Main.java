package juegos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		/**
		 * <p>genera una frase aleatoria mediante la clase Verborrea y el metodo gerenerarFrase()</p>
		 * @author EBF10
		 */
		Verborrea frase = new Verborrea();
		System.out.println(frase.generarfrase());
		
		/**
		 * <p>genera un numero aleatorio mediante la clase Jugar (en NumerosAleatorios)</p>
		 * @author Blanca
		 */
		Jugar jugarNumeroAleatorio = new Jugar();
		jugarNumeroAleatorio.Jugar();
		System.out.println(Jugar.jugarNumeroAleatorio());
		
		/**
		 * <p>Genera numero aleatorio, para saber si has acertado</p>
		 * @author Alvaro
		 */
		Adivinanza numero = new Adivinanza();
		System.out.println(Adivinanza.numeroAleatorio());
	}

}
