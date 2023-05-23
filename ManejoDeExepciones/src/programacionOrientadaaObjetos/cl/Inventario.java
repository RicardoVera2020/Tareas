package programacionOrientadaaObjetos.cl;


public class Inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creacion de objetos
		
		Cliente cliente1 = new Cliente("pedro","34");
		Vehiculo vehiculo1 = new Vehiculo("rojo", "null", "null");
		
		LibroVenta libroventa1 = new LibroVenta("fhdfh", "jsjs");

		libroventa1.guardarVenta1(cliente1, vehiculo1);
	}
}
