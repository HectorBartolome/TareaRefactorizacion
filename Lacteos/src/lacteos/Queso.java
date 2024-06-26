package lacteos;

public class Queso {
	
	private String tipo;
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
		this.tipo = tipo_leche;
		this.cantidad_leche = cantidad_leche;
		this.peso = peso;
	}

	/**
	 * 
	 */
	public Queso() {
		super();
	}

	/**
	 * @return the tipo_leche
	 */
	public String getTipo_leche() {
		return tipo;
	}

	/**
	 * @param tipo_leche the tipo_leche to set
	 */
	public void setTipo_leche(String tipo_leche) {
		this.tipo = tipo_leche;
	}

	/**
	 * @return the cantidad_leche
	 */
	public int getCantidad_leche() {
		return cantidad_leche;
	}

	/**
	 * @param cantidad_leche the cantidad_leche to set
	 */
	public void setCantidad_leche(int cantidad_leche) {
		this.cantidad_leche = cantidad_leche;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void imprimir_cabecera () {
		System.out.println("QUESOS ENTREPINARES");
		System.out.println("Registro Sanitario No 52/38751");
		System.out.println("Para consultar el lote del producto revise la etiqueta");
		System.out.println("Peso: " + this.peso); System.out.println("Tipo de leche: " +
		this.tipo);
		System.out.println("Cantidad de leche: " + this.cantidad_leche); }
	public void imprimir_detalle () {
		System.out.println("Para consultar el lote del producto revise la etiqueta");
		System.out.println("Peso: " + this.peso); System.out.println("Tipo de leche: " +
		this.tipo);
		System.out.println("Cantidad de leche: " + this.cantidad_leche); }
}
