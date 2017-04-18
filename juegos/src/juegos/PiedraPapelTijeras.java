package juegos;
import java.util.Random;
import java.util.Scanner;


public class PiedraPapelTijeras {
	
	    private Usuario usuario;
	    private Computadora computadora;
	    private int usuarioPuntos;
	    private int computadoraPuntos;
	    private int cantidadDeJuegos;
	 
	    private enum Move {
	        ROCA, PAPEL, TIJERAS;
	 
	        /**
	         * Compara esta jugada con otra para determinar si es un empate, un triunfo o
	         * una derrota.
	         * 
	         * @param otherMove
	         *            jugada a comparar
	         * @return 1 si esta jugada le gana a la otra, -1 se esta jugada pierde frente a
	         *         la otra, 0 si las jugadas empatan
	         */
	        public int compareMoves(Move otherMove) {
	            // Empate
	            if (this == otherMove)
	                return 0;
	 
	            switch (this) {
	            case ROCA:
	                return (otherMove == TIJERAS ? 1 : -1);
	            case PAPEL:
	                return (otherMove == ROCA ? 1 : -1);
	            case TIJERAS:
	                return (otherMove == PAPEL ? 1 : -1);
	            }
	 
	            // Nunca debería llegar hasta aquí
	            return 0;
	        }
	    }
	 
	    private class Usuario {
	        private Scanner inputScanner;
	 
	        public Usuario() {
	            inputScanner = new Scanner(System.in);
	        }
	 
	        public Move getMove() {
	            // Solicitarle al usuario
	            System.out.print("Roca, papel o tijeras? ");
	 
	            // Obtener la entrada del usuario
	            String usuarioInput = inputScanner.nextLine();
	            usuarioInput = usuarioInput.toUpperCase();
	            char firstLetter = usuarioInput.charAt(0);
	            if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'T') {
	                // Usuario ha ingresado un dato válido
	                switch (firstLetter) {
	                case 'R':
	                    return Move.ROCA;
	                case 'P':
	                    return Move.PAPEL;
	                case 'T':
	                    return Move.TIJERAS;
	                }
	            }
	 
	            // Usuario no ha ingresado un dato válido. Solicitar nuevamente.
	            return getMove();
	        }
	 
	        public boolean playAgain() {
	            System.out.print("Quieres jugar de nuevo? ");
	            String usuarioInput = inputScanner.nextLine();
	            usuarioInput = usuarioInput.toUpperCase();
	            return usuarioInput.charAt(0) == 'S';
	        }
	    }
	 
	    private class Computadora {
	        public Move getMove() {
	            Move[] moves = Move.values();
	            Random random = new Random();
	            int index = random.nextInt(moves.length);
	            return moves[index];
	        }
	    }
	 
	    public PiedraPapelTijeras() {
	        usuario = new Usuario();
	        computadora = new Computadora();
	        usuarioPuntos = 0;
	        computadoraPuntos = 0;
	        cantidadDeJuegos = 0;
	    }
	 
	    public void startGame() {
	        System.out.println("ROCA, PAPEL, TIJERAS!");
	 
	        // Obtener jugadas
	        Move usuarioMove = usuario.getMove();
	        Move computadoraMove = computadora.getMove();
	        System.out.println("\nYou played " + usuarioMove + ".");
	        System.out.println("Computadora played " + computadoraMove + ".\n");
	 
	        // Comparar jugadas y determinar ganador
	        int compareMoves = usuarioMove.compareMoves(computadoraMove);
	        switch (compareMoves) {
	        case 0: // Empate
	            System.out.println("Empate!");
	            break;
	        case 1: // Gana Usuario
	            System.out.println(usuarioMove + " le gana a " + computadoraMove + ". Ganaste!");
	            usuarioPuntos++;
	            break;
	        case -1: // Gana Computadora
	            System.out.println(computadoraMove + " le gana a " + usuarioMove + ". Perdiste.");
	            computadoraPuntos++;
	            break;
	        }
	        cantidadDeJuegos++;
	 
	        // Preguntar al usuario si jugar nuevamente
	        if (usuario.playAgain()) {
	            System.out.println();
	            startGame();
	        } else {
	            printGameStats();
	        }
	    }
	 
	    /**
	     * Imprimir las estadísticas del juego. Calcular un empate como ½ victoria en
	     * el porcentaje de victorias.
	     */
	    private void printGameStats() {
	        int wins = usuarioPuntos;
	        int losses = computadoraPuntos;
	        int ties = cantidadDeJuegos - usuarioPuntos - computadoraPuntos;
	        double percentageWon = (wins + ((double) ties) / 2) / cantidadDeJuegos;
	 
	        // Línea
	        System.out.print("+");
	        printDashes(68);
	        System.out.println("+");
	 
	        // Imprimir títulos
	        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
	                "VICTORIAS", "DERROTAS", "EMPATES", "JUEGOS", "PORCENTAJE VICTORIAS");
	 
	        // Línea
	        System.out.print("|");
	        printDashes(10);
	        System.out.print("+");
	        printDashes(10);
	        System.out.print("+");
	        printDashes(10);
	        System.out.print("+");
	        printDashes(16);
	        System.out.print("+");
	        printDashes(18);
	        System.out.println("|");
	 
	        // Imprimir valores
	        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
	                wins, losses, ties, cantidadDeJuegos, percentageWon * 100);
	 
	        // Línea
	        System.out.print("+");
	        printDashes(68);
	        System.out.println("+");
	    }
	 
	    private void printDashes(int numberOfDashes) {
	        for (int i = 0; i < numberOfDashes; i++) {
	            System.out.print("-");
	        }
	    }
	 
	    public static void main(String[] args) {
	        PiedraPapelTijeras game = new PiedraPapelTijeras();
	        game.startGame();
	    }
	}


