public class Card {
	private String palo; // tréboles, corazones, picas o diamantes
	private String color; // rojo o negro
	private String valor; // 2 al 10, A, J, Q o K

	public Card(String palo, String color, String valor) {
	  this.palo = palo;
	  this.color = color;
	  this.valor = valor;
	}

	public String getPalo() {
	  return palo;
	}

	public String getColor() {
	  return color;
	}

	public String getValor() {
	  return valor;
	}

	public String toString() {
	  return palo + "," + color + "," + valor;
	}
}