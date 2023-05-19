package autosLatam;


 public class Vehiculo {

    protected String  color;
    protected String  patente;
    private int     valorpasaje;
 
 //constructor
 public Vehiculo(String color, String patente) {
        this.color   = color;
        this.patente = patente;
        
    }
public Vehiculo () {
	
}
 
 
 //	Genero get y set  automatico
 
 
 //color
    public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

//patente
public String getPatente() {
	return patente;
}

public void setPatente(String patente) {
	this.patente = patente;
}

//cantidad de asientos


//valorpasaje
public int getValorpasaje() {
	return valorpasaje;
}

public void setValorpasaje(int valorpasaje) {
	this.valorpasaje = valorpasaje;
}


public void pagarPasaje() {
        System.out.println("Se ha pagado el pasaje.");
    }
}


  