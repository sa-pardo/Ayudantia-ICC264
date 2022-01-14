package Modelo;

import java.util.ArrayList;
import Modelo.Venta;

public class Vendedor {
	private String nombre;
	private String rut;
	private String fechaNacimiento;
	private int sueldo;
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public Vendedor(String nombre, String rut, String fechaNacimiento, int sueldo, ArrayList<Venta> ventas) {
		this.nombre = nombre;
		this.rut = rut;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
		this.ventas = ventas;
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

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
}