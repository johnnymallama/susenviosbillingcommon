package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Notificacion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Notificacion {

	@XmlAttribute(name = "Tipo")
	private String tipo;

	@XmlAttribute(name = "De")
	private String de;

	@XmlElement(name = "Para")
	private String para;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

}
