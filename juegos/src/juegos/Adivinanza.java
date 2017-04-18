package juegos[grupo5 master];

	import java.util.Random;
	import java.util.Scanner;
	public class Adivinanza {

		public static void main(String[] args) {
			Random random = new Random();
			int numeroAleatorio;
			numeroAleatorio= random.nextInt(1000) + 1;
			//System.out.println("Numero aleatorio: " + numeroAleatorio);
			int numIntentos=1;
			int numUsuario;
			Scanner scanner= new Scanner (System.in); //escaner asociado al tecaldo

			while (true){
				System.out.printf("Introduce un numero (Intento %d): " ,numIntentos );
				String Linea = scanner.nextLine();
				System.out.println("Has escrito: "+ Linea);
				numUsuario= Integer.parseInt(Linea);
				
			
				if (numUsuario== numeroAleatorio)
				break;
			
				else if (numUsuario < numeroAleatorio)
				System.out.println("Prueba con un numero mayor");
				else 
				System.out.println("Prueba un numero menor");
				numIntentos ++;
			}
			System.out.println("Has acertado!!!");
			
		}
			

	}

