package autosLatam;

public class Bus extends Vehiculo  {
	private  int cantidadAsientos;
	private  int disponibles;
	
	//private int cantidadPasajeros=100
	//private int pasaje=1000
	
//constructor y atributos
   public Bus(String color,String patente,int cantidadAsientos,int  disponibles,int valorPasaje){
   super (color,patente);
   
   
  
   }
 //costructor vacio
	 public Bus() {
		 
	 } 
   
	// generar tostring automatico
	public String toString() {
		return "Bus [cantidadAsientos]=" + cantidadAsientos +", [disponibles]=" + disponibles +",[Color=]" + getColor() + ", [Patente=]"
				+ getPatente() + ", [Valorpasaje=]" + getValorpasaje()  
				 ;
	}

	
}


/*  




1. Crear un método en la clase Bus que reciba como parámetro 
la cantidad de pasajeros y el valor del pasaje, para indicar 
cuanto genera por recorrido, considere un recorrido de 
60 kilómetros 4 veces al día. Indique valores diarios,
 semanales y mensuales. 

//2. Crear un método en la clase Bus que calcule el gasto de combustible 
 * o petróleo, diario, semanal y mensual, según los datos de la solicitud 1.''
 */