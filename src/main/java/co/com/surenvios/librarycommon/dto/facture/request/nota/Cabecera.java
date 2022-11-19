package co.com.surenvios.librarycommon.dto.facture.request.nota;

import javax.xml.bind.annotation.XmlAttribute;

import co.com.surenvios.librarycommon.dto.facture.request.CabeceraGeneral;

public class Cabecera extends CabeceraGeneral {

	@XmlAttribute(name = "Prefijo")
	private String prefijo;

	@XmlAttribute(name = "MonedaNota")
	private String monedaNota;

	@XmlAttribute(name = "LineasDeNota")
	private String lineasDeNota;

	@XmlAttribute(name = "OrdenCompra")
	private String ordenCompra;

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public String getMonedaNota() {
		return monedaNota;
	}

	public void setMonedaNota(String monedaNota) {
		this.monedaNota = monedaNota;
	}

	public String getLineasDeNota() {
		return lineasDeNota;
	}

	public void setLineasDeNota(String lineasDeNota) {
		this.lineasDeNota = lineasDeNota;
	}

	public String getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(String ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

}
