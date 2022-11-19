package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Detalle {

	@XmlAttribute(name = "NumeroLinea")
	private String numeroLinea;

	@XmlAttribute(name = "Cantidad")
	private String cantidad;

	@XmlAttribute(name = "UnidadMedida")
	private String unidadMedida;

	@XmlAttribute(name = "SubTotalLinea")
	private String subTotalLinea;

	@XmlAttribute(name = "Descripcion")
	private String descripcion;

	@XmlAttribute(name = "CantidadBase")
	private String cantidadBase;

	@XmlAttribute(name = "UnidadCantidadBase")
	private String unidadCantidadBase;

	@XmlAttribute(name = "PrecioUnitario")
	private String precioUnitario;

	@XmlAttribute(name = "ValorTotalItem")
	private String valorTotalItem;

	public String getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(String numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getSubTotalLinea() {
		return subTotalLinea;
	}

	public void setSubTotalLinea(String subTotalLinea) {
		this.subTotalLinea = subTotalLinea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantidadBase() {
		return cantidadBase;
	}

	public void setCantidadBase(String cantidadBase) {
		this.cantidadBase = cantidadBase;
	}

	public String getUnidadCantidadBase() {
		return unidadCantidadBase;
	}

	public void setUnidadCantidadBase(String unidadCantidadBase) {
		this.unidadCantidadBase = unidadCantidadBase;
	}

	public String getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(String precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getValorTotalItem() {
		return valorTotalItem;
	}

	public void setValorTotalItem(String valorTotalItem) {
		this.valorTotalItem = valorTotalItem;
	}

}