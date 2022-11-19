package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Direccion {

	@XmlAttribute(name = "CodigoMunicipio")
	private String codigoMunicipio;

	@XmlAttribute(name = "NombreCiudad")
	private String nombreCiudad;

	@XmlAttribute(name = "NombreDepartamento")
	private String nombreDepartamento;

	@XmlAttribute(name = "CodigoDepartamento")
	private String codigoDepartamento;

	@XmlAttribute(name = "Direccion")
	private String direccionFisica;

	@XmlAttribute(name = "CodigoPostal")
	private String codigoPostal;

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getDireccion() {
		return direccionFisica;
	}

	public void setDireccion(String direccion) {
		this.direccionFisica = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}
