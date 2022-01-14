package Modelo;

import java.util.ArrayList;
import Modelo.Cuenta;

public class Cliente {
	private String nombre;
	private String rut;
	private String fechaNacimiento;
	private Cuenta[] cuentas = new Cuenta[3];

	public Cliente(String nombre, String rut, String fechaNacimiento) {
		this.nombre = nombre;
		this.rut = rut;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
}