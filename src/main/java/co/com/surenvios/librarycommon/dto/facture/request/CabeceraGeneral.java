package co.com.surenvios.librarycommon.dto.facture.request;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Cabecera")
@XmlAccessorType(XmlAccessType.FIELD)
public class CabeceraGeneral {

	@XmlAttribute(name = "TipoOperacion")
	private String tipoOperacion;

	@XmlAttribute(name = "Numero")
	private String numeroFactura;

	@XmlAttribute(name = "FechaEmision")
	private String fechaEmision;

	@XmlAttribute(name = "HoraEmision")
	private String horaEmision;

	@XmlAttribute(name = "Observaciones")
	private String observaciones;

	@XmlAttribute(name = "FormaDePago")
	private String formaDePago;

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getHoraEmision() {
		return horaEmision;
	}

	public void setHoraEmision(String horaEmision) {
		this.horaEmision = horaEmision;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

}
