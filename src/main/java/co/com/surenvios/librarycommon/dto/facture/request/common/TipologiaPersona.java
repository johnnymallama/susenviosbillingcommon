package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class TipologiaPersona {

	@XmlAttribute(name = "TipoPersona")
	private String tipoPersona;

	@XmlAttribute(name = "TipoRegimen")
	private String tipoRegimen;

	@XmlAttribute(name = "TipoIdentificacion")
	private String tipoIdentificacion;

	@XmlAttribute(name = "NumeroIdentificacion")
	private String numeroIdentificacion;

	@XmlAttribute(name = "DV")
	private String digitoVerificacion;

	@XmlAttribute(name = "RazonSocial")
	private String razonSocial;

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getDigitoVerificacion() {
		return digitoVerificacion;
	}

	public void setDigitoVerificacion(String digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

}
