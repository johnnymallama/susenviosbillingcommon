package co.com.surenvios.librarycommon.dto.facture.request.common;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Extension {

	@XmlElementWrapper(name = "DatosAdicionales")
	@XmlElement(name = "campoAdicional")
	private List<CampoAdicional> campoAdicional;

	public List<CampoAdicional> getCampoAdicional() {
		return campoAdicional;
	}

	public void setCampoAdicional(List<CampoAdicional> campoAdicional) {
		this.campoAdicional = campoAdicional;
	}

}
