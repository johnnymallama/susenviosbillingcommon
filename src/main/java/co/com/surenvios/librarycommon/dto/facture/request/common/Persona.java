package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {

	@XmlAttribute(name = "PrimerNombre")
	private String primerNombre;

	@XmlAttribute(name = "SegundoNombre")
	private String segundoNombre;

	@XmlAttribute(name = "Apellido")
	private String apellido;

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
