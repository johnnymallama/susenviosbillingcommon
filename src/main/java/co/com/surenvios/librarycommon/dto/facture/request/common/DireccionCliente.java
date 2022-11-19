package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class DireccionCliente extends Direccion {

	@XmlAttribute(name = "NombrePais")
	private String nombrePais;

	@XmlAttribute(name = "CodigoPais")
	private String codigoPais;

	@XmlAttribute(name = "IdiomaPais")
	private String idiomaPais;

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getIdiomaPais() {
		return idiomaPais;
	}

	public void setIdiomaPais(String idiomaPais) {
		this.idiomaPais = idiomaPais;
	}

}