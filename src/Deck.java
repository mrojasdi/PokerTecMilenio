import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cartas; // Almacena las cartas
	private int numCartas; // número de cartas en el deck
	
	public Deck() {
		cartas = new ArrayList<Card>(); //empezar la lista de cartas
		numCartas =52; // empezar el número de cartas a 52
		crearCartas(); // crear las cartas del deck
		shuffle(); // mezclar el deck
	}
	
	private void crearCartas() {
	    String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
	    String[] colores = {"Negro", "Rojo"};
	    String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

	    for (int i = 0; i < palos.length; i++) {
	      for (int j = 0; j < valores.length; j++) {
	        Card carta = new Card(palos[i], colores[i % 2], valores[j]);
	        cartas.add(carta);
	      }
	}
}
	
	 public void shuffle() {
	    Collections.shuffle(cartas);
		System.out.println("Se mezcló el Deck.");
	}

	 public Card head() {
		 if (numCartas > 0) {
		   Card primera = cartas.get(0);
		   cartas.remove(0);
		   numCartas--;
		   System.out.println(primera + "\nQuedan " + numCartas);
		   return primera;
		  } else {
		    System.out.println("El Deck está vacío.");
		    return null;
		  }
	}

	public Card pick() {
		if (numCartas > 0) {
		   Random random = new Random();
		   int indice = random.nextInt(numCartas);
		   Card carta = cartas.get(indice);
		   cartas.remove(indice);
		   numCartas--;
		   System.out.println(carta + "\nQuedan " + numCartas);
		   return carta;
		 } else {
		   System.out.println("El Deck está vacío.");
		   return null;
		 }
	}

	public Card[] hand() {
		if (numCartas >= 5) {
		   Card[] mano = new Card[5];
		   for (int i = 0; i < 5; i++) {
		     mano[i] = cartas.get(i);
		   }
		   for (int i = 0; i < 5; i++) {
		     cartas.remove(0);
		   }
		   numCartas -= 5;
		   for (int i = 0; i < 5; i++) {
			  System.out.println(mano[i]);
		   }
		   System.out.println("Quedan " + numCartas);
		   return mano;
		 } else {
		   System.out.println("No se puede generar una mano.");
		   return null;
		 }
	}
}	