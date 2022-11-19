package co.com.surenvios.librarycommon.dto.facture.request.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Linea {

	@XmlElement(name = "Detalle")
	private Detalle detalle;

	@XmlElementWrapper(name = "CodificacionesEstandar")
	@XmlElement(name = "CodificacionEstandar")
	private List<CodificacionEstandar> codificacionEstandar;

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}

	public List<CodificacionEstandar> getCodificacionEstandar() {
		return codificacionEstandar;
	}

	public void setCodificacionEstandar(List<CodificacionEstandar> codificacionEstandar) {
		this.codificacionEstandar = codificacionEstandar;
	}

	public boolean addCodificacionEstandar(CodificacionEstandar codificacionEstandar) {
		if (this.codificacionEstandar == null) {
			this.codificacionEstandar = new ArrayList<CodificacionEstandar>();
		}
		return this.codificacionEstandar.add(codificacionEstandar);
	}

}
