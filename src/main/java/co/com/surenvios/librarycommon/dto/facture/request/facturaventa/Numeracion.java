package co.com.surenvios.librarycommon.dto.facture.request.facturaventa;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "NumeracionDIAN")
@XmlAccessorType(XmlAccessType.FIELD)
public class Numeracion {

	@XmlAttribute(name = "NumeroResolucion")
	private String numeroResolucion;

	@XmlAttribute(name = "FechaInicio")
	private String fechaInicio;

	@XmlAttribute(name = "FechaFin")
	private String fechaFin;

	@XmlAttribute(name = "PrefijoNumeracion")
	private String prefijoNumeracion;

	@XmlAttribute(name = "ConsecutivoInicial")
	private String consecutivoInicial;

	@XmlAttribute(name = "ConsecutivoFinal")
	private String consecutivoFinal;

	public String getNumeroResolucion() {
		return numeroResolucion;
	}

	public void setNumeroResolucion(String numeroResolucion) {
		this.numeroResolucion = numeroResolucion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPrefijoNumeracion() {
		return prefijoNumeracion;
	}

	public void setPrefijoNumeracion(String prefijoNumeracion) {
		this.prefijoNumeracion = prefijoNumeracion;
	}

	public String getConsecutivoInicial() {
		return consecutivoInicial;
	}

	public void setConsecutivoInicial(String consecutivoInicial) {
		this.consecutivoInicial = consecutivoInicial;
	}

	public String getConsecutivoFinal() {
		return consecutivoFinal;
	}

	public void setConsecutivoFinal(String consecutivoFinal) {
		this.consecutivoFinal = consecutivoFinal;
	}

}
