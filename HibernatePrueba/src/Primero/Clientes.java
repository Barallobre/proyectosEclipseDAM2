package Primero;
// Generated 11 ene. 2021 12:41:46 by Hibernate Tools 5.4.21.Final

/**
 * Clientes generated by hbm2java
 */
public class Clientes implements java.io.Serializable {

	private byte numCli;
	private String nombreCli;
	private String direccionCli;

	public Clientes() {
	}

	public Clientes(byte numCli) {
		this.numCli = numCli;
	}

	public Clientes(byte numCli, String nombreCli, String direccionCli) {
		this.numCli = numCli;
		this.nombreCli = nombreCli;
		this.direccionCli = direccionCli;
	}

	public byte getNumCli() {
		return this.numCli;
	}

	public void setNumCli(byte numCli) {
		this.numCli = numCli;
	}

	public String getNombreCli() {
		return this.nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getDireccionCli() {
		return this.direccionCli;
	}

	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}

}
