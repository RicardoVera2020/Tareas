package programacionOrientadaaObjetos.cl;

public class Vehiculo {
	public String Patente;
	public String Modelo;
	public String color;
	
	public Vehiculo (String Patente, String Modelo,String color ) {
          super();          
          this.Patente = Patente; // Asigna el valor del parámetro 
	      this.Modelo = Modelo;
	      this.color= color;
	      
	      
	      
	      
	      
	      
	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}}