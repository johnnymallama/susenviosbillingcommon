package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class CodificacionEstandar {

	@XmlAttribute(name = "CodigoArticulo")
	private String codigoArticulo;

	@XmlAttribute(name = "CodigoEstandar")
	private String codigoEstandar;

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getCodigoEstandar() {
		return codigoEstandar;
	}

	public void setCodigoEstandar(String codigoEstandar) {
		this.codigoEstandar = codigoEstandar;
	}

}