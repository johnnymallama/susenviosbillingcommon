package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	@XmlAttribute(name = "Bruto")
	private String bruto;

	@XmlAttribute(name = "BaseImponible")
	private String baseImponible;

	@XmlAttribute(name = "BrutoMasImpuestos")
	private String brutoMasImpuesto;

	@XmlAttribute(name = "Impuestos")
	private String impuesto;

	@XmlAttribute(name = "Descuentos")
	private String descuento;

	@XmlAttribute(name = "Retenciones")
	private String retencion;

	@XmlAttribute(name = "Cargos")
	private String cargo;

	@XmlAttribute(name = "General")
	private String general;

	@XmlAttribute(name = "Anticipo")
	private String anticipo;

	@XmlAttribute(name = "Redondeo")
	private String redondeo;

	@XmlAttribute(name = "TotalDescuentosLineas")
	private String totalDescuentoLinea;

	@XmlAttribute(name = "TotalCargosLineas")
	private String totalCargoLinea;

	public String getBruto() {
		return bruto;
	}

	public void setBruto(String bruto) {
		this.bruto = bruto;
	}

	public String getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(String baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getBrutoMasImpuesto() {
		return brutoMasImpuesto;
	}

	public void setBrutoMasImpuesto(String brutoMasImpuesto) {
		this.brutoMasImpuesto = brutoMasImpuesto;
	}

	public String getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getRetencion() {
		return retencion;
	}

	public void setRetencion(String retencion) {
		this.retencion = retencion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public String getAnticipo() {
		return anticipo;
	}

	public void setAnticipo(String anticipo) {
		this.anticipo = anticipo;
	}

	public String getRedondeo() {
		return redondeo;
	}

	public void setRedondeo(String redondeo) {
		this.redondeo = redondeo;
	}

	public String getTotalDescuentoLinea() {
		return totalDescuentoLinea;
	}

	public void setTotalDescuentoLinea(String totalDescuentoLinea) {
		this.totalDescuentoLinea = totalDescuentoLinea;
	}

	public String getTotalCargoLinea() {
		return totalCargoLinea;
	}

	public void setTotalCargoLinea(String totalCargoLinea) {
		this.totalCargoLinea = totalCargoLinea;
	}

}
