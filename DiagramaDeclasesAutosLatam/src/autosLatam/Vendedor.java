package autosLatam;

public class Vendedor extends Persona {
    private String direccion;

    public Vendedor(String rut, String nombre,  String direccion) {
        super(rut, nombre);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
