package autosLatam;

public class Minibus extends Bus {
    private String tipoViaje;

    public Minibus(String color, String patente, int cantidadAsientos, String tipoViaje) {
        //super(color, patente);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
}
