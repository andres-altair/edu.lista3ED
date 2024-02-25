package Dtos;

public class mesdto {
	
	String nombre = "aaaaaa";
	int numero = 9999;
	
	public mesdto() {}
	public mesdto(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	
	
	//getter setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "mesdto [nombre=" + nombre + ", numero=" + numero + "]";
	}
	
	
}
