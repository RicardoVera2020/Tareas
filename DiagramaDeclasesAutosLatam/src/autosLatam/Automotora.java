package autosLatam;

public class Automotora {
	// ejecucion

public static void main(String[] args) {
	
	//creacion de objetos
	Bus bus1 = new Bus("rojo", "1223", 45, 20, 1000);
    System.out.println(bus1.toString());
	  
    Cliente cliente1 = new Cliente( "10.100.100-k","jose",35);
    System.out.println(cliente1.toString());
    

	int stock = 44;
	Tienda tienda1 = new Tienda("uno", "tesla", stock);
	System.out.println(tienda1.toString());
	tienda1.existeStock();

	
	//  objetos taxi
    Taxi taxi1 = new Taxi("amaillo", "2020", 1500);
    System.out.println(taxi1.toString());

    // Pagar pasaje
    int monto = 2000;
    taxi1.pagarPasaje(monto);
 
 
  }
}
