package lacteos;

public class Queso {
	
	private String tipo_leche;
	private int cantidad_leche;
	/*Se inserta en mililitros*/
	private double peso;
	/*Se inserta en gramos*/
	
	/**
	 * @param tipo_leche
	 * @param cantidad_leche
	 * @param peso
	 */
	public Queso(String tipo_leche, int cantidad_leche, double peso) {
		super();
		this.tipo_leche = tipo_leche;
		this.cantidad_leche = cantidad_leche;
		this.peso = peso;
	}

	
}
