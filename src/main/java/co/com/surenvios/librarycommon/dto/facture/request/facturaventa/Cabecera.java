package co.com.surenvios.librarycommon.dto.facture.request.facturaventa;

import javax.xml.bind.annotation.*;

import co.com.surenvios.librarycommon.dto.facture.request.CabeceraGeneral;

public class Cabecera extends CabeceraGeneral {

	@XmlAttribute(name = "Vencimiento")
	private String fechaVencimiento;

	@XmlAttribute(name = "MonedaFactura")
	private String monedaFactura;

	@XmlAttribute(name = "TipoFactura")
	private String tipoFactura;

	@XmlAttribute(name = "LineasDeFactura")
	private String lineasDeFactura;

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getMonedaFactura() {
		return monedaFactura;
	}

	public void setMonedaFactura(String monedaFactura) {
		this.monedaFactura = monedaFactura;
	}

	public String getTipoFactura() {
		return tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	public String getLineasDeFactura() {
		return lineasDeFactura;
	}

	public void setLineasDeFactura(String lineasDeFactura) {
		this.lineasDeFactura = lineasDeFactura;
	}

}
