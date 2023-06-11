package Modelo;

public class Cliente {
    private String runCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String emailCliente;
    private int aniosCliente;
    private String nombreCategoria;

    public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String emailCliente, int aniosCliente, String nombreCategoria) {
        this.runCliente = runCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.emailCliente = emailCliente;
        this.aniosCliente = aniosCliente;
        this.nombreCategoria = nombreCategoria;
    }

    public Cliente(String runCliente2, String nombreCliente2, String apellidoCliente2, String emailCliente2,
			int aniosCliente2, CategoriaEnum nombreCategoria2) {
		// TODO Auto-generated constructor stub
	}

	public String getRunCliente() {
        return runCliente;
    }

    public void setRunCliente(String runCliente) {
        this.runCliente = runCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getAniosCliente() {
        return aniosCliente;
    }

    public void setAniosCliente(int aniosCliente) {
        this.aniosCliente = aniosCliente;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "Cliente [runCliente=" + runCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
                + apellidoCliente + ", emailCliente=" + emailCliente + ", aniosCliente=" + aniosCliente + ", nombreCategoria=" + (nombreCategoria != null ? nombreCategoria.toString() : "") + "]";
    }
}
