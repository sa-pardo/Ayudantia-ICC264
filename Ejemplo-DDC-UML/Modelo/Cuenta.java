package Modelo;

import java.util.ArrayList;
import Modelo.Venta;

public class Cuenta {
	private int idCuenta;
	private Cliente cliente;
	private ArrayList<Venta> compras = new ArrayList<Venta>();

	public Cuenta(int idCuenta, Cliente cliente, ArrayList<Venta> compras) {
		this.idCuenta = idCuenta;
		this.cliente = cliente;
		this.compras = compras;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Venta> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Venta> compras) {
		this.compras = compras;
	}
}