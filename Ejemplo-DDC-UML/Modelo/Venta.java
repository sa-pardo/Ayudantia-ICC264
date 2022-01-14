package Modelo;

import java.util.ArrayList;
import Modelo.Producto;

public class Venta {
	private int idVenta;
	private Cuenta cuentaCliente;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private Boleta boleta;
	private Vendedor vendedor;

	public Venta(int idVenta, Cuenta cuentaCliente, ArrayList<Producto> productos, Boleta boleta, Vendedor vendedor) {
		this.idVenta = idVenta;
		this.cuentaCliente = cuentaCliente;
		this.productos = productos;
		this.boleta = boleta;
		this.vendedor = vendedor;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Cuenta getCuentaCliente() {
		return cuentaCliente;
	}

	public void setCuentaCliente(Cuenta cuentaCliente) {
		this.cuentaCliente = cuentaCliente;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Boleta getBoleta() {
		return boleta;
	}

	public void setBoleta(Boleta boleta) {
		this.boleta = boleta;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}