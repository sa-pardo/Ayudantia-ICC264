package Modelo;

public class Boleta {

	public int getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(int idBoleta) {
		this.idBoleta = idBoleta;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Venta getCompra() {
		return compra;
	}

	public void setCompra(Venta compra) {
		this.compra = compra;
	}

	private int idBoleta;
	private int subtotal;
	private int total;
	private double descuento;
	private Venta compra;

	public Boleta(int idBoleta, int subtotal, int total, double descuento, Venta compra) {
		this.idBoleta = idBoleta;
		this.subtotal = subtotal;
		this.total = total;
		this.descuento = descuento;
		this.compra = compra;
	}
}