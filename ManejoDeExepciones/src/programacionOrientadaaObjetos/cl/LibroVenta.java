package programacionOrientadaaObjetos.cl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class LibroVenta {
	
	//paso 1 atributos de variable alfanumerica
	
	 public String nombreVenta;
	 public String fechaVenta ;
	 
	 public LibroVenta() {}

	 
	 // paso 2 respectivo constructor de la clase libro venta para inicicalizar el objeto
	 
	 public LibroVenta( String nombreVenta,String fechaVenta) {
     super();
	 this.nombreVenta = nombreVenta;
     this.fechaVenta  = fechaVenta;
	 }

    // get y set automaticosl paso 3
	public String getNombreVenta() {
		return nombreVenta;
	}


	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}


	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	 
	// metodo guardar venta
	public void guardarVenta1(Cliente cliente, Vehiculo vehiculo) {
		String nombreDirectorio = "ficheros";
		String fichero = getNombreVenta();
		File archivo = new File("src/" + nombreDirectorio + "/" + fichero);
		
		// try catch
		 
		try {
			File directorio = archivo.getParentFile();
			if (!directorio.exists()) {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado");
				}
			}
			
			String fecha = getFechaVenta();
			FileWriter writer = new FileWriter(archivo);
			BufferedWriter buffer = new BufferedWriter(writer);
			buffer.write(vehiculo.getPatente() + "\n");
			buffer.write(cliente.getEdad() + "\n");
			buffer.write(fecha + "\n");
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error al guardar la venta: " + e.getMessage());
		}
	}
}
	