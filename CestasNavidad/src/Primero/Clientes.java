package Primero;
// Generated 18 ene. 2021 9:58:01 by Hibernate Tools 5.4.21.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes implements java.io.Serializable {

	private int dni;
	private String nombreRazonSocial;
	private String direccion;
	private String telfonoFax;
	private String email;
	private Set presupuestoses = new HashSet(0);

	public Clientes() {
	}

	public Clientes(int dni, String nombreRazonSocial) {
		this.dni = dni;
		this.nombreRazonSocial = nombreRazonSocial;
	}

	public Clientes(int dni, String nombreRazonSocial, String direccion, String telfonoFax, String email,
			Set presupuestoses) {
		this.dni = dni;
		this.nombreRazonSocial = nombreRazonSocial;
		this.direccion = direccion;
		this.telfonoFax = telfonoFax;
		this.email = email;
		this.presupuestoses = presupuestoses;
	}

	public int getDni() {
		return this.dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombreRazonSocial() {
		return this.nombreRazonSocial;
	}

	public void setNombreRazonSocial(String nombreRazonSocial) {
		this.nombreRazonSocial = nombreRazonSocial;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelfonoFax() {
		return this.telfonoFax;
	}

	public void setTelfonoFax(String telfonoFax) {
		this.telfonoFax = telfonoFax;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getPresupuestoses() {
		return this.presupuestoses;
	}

	public void setPresupuestoses(Set presupuestoses) {
		this.presupuestoses = presupuestoses;
	}

}
