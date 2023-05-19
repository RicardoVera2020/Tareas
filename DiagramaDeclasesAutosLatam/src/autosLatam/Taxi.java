package autosLatam;

public class Taxi extends Vehiculo {
    private int valorPasaje = 1000;

    // Constructor
    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    // Getter y Setter para valorPasaje
    public int getValorPasaje() {
        return valorPasaje;
    }
    
    
 // Método pagar pasaje taxi
    public void pagarPasaje(int monto) {
        System.out.println("\tTotal Pasaje $" + valorPasaje);
        System.out.println("\tTotal Monto  $" + monto);
        if (monto >= valorPasaje) {
            int vuelto = monto - valorPasaje;
            System.out.println("\tTotal Vuelto $" + vuelto);
        } else {
            System.out.println("\tSe devuelve el pasaje original $" + valorPasaje);
        }
    }

    @Override
    public String toString() {
        return "Taxi [valorPasaje=" + valorPasaje + ", color=" + color + ", patente=" + patente + "]";
      }

}




/*● Método pagarPasaje:
○ Ingresar el monto por parámetro, antes de pagar el pasaje se debe validar
que este monto sea mayor al valor del pasaje inicial.
○ Si se cumple, devolver el vuelto.
○ Si no se cumple, devolver el pasaje original.
 * 
 * 
 */
