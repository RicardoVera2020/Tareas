package autosLatam;

public class Tienda {
	
    private String vendedor;
    private String vehiculo;
    private int stock;
    
    public Tienda(String vendedor,String vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void existeStock() {
		 System.out.println("Cantidad de stock es " + stock);
    }
		// TODO Auto-generated method stub
		
	
	@Override
	public String toString() {
	    return "Tienda [vendedor=" + vendedor + ", vehiculo=" + vehiculo + ", stock=" + stock + "]";
	}

	}
    