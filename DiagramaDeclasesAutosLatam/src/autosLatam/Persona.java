package autosLatam;

public class Persona {
	
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + "]";
	}

	//atributos
	private String rut;
    private String nombre;
   // private int edad;

    //constructor(ayuda a crear nuevos objetos tipo persona)
    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
      //  this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
