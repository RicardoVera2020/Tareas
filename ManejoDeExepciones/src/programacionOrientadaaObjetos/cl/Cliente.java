package programacionOrientadaaObjetos.cl;

public class Cliente {
	// atributos cliente
	public String nombre;
	public String edad;
	
	// constructor clase cliente para creación de nuevos objetos de la clase cliente
	public Cliente(String nombre, String edad) {
		super(); // para invocar a la clase padre y sus atributos
		this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre
		this.edad = edad; // Asigna el valor del parámetro edad al atributo edad
	}

	public Cliente() {}

	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
}
