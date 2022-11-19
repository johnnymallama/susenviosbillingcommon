package co.com.surenvios.librarycommon.dto.facture.request.facturaventa;

import javax.xml.bind.annotation.*;

import co.com.surenvios.librarycommon.dto.facture.request.common.*;

@XmlRootElement(name = "Factura")
@XmlAccessorType(XmlAccessType.FIELD)
public class FacturaVentaRequest {

	@XmlElement(name = "Cabecera")
	private Cabecera cabecera;

	@XmlElement(name = "NumeracionDIAN")
	private Numeracion numeracionDian;

	@XmlElement(name = "Notificacion")
	private Notificacion notificacion;

	@XmlElement(name = "Emisor")
	private Emisor emisor;

	@XmlElement(name = "Cliente")
	private Cliente cliente;

	@XmlElement(name = "Totales")
	private Total total;

	@XmlElement(name = "Linea")
	private Linea linea;

	@XmlElement(name = "Extensiones")
	private Extension extension;

	public Cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera cabecera) {
		this.cabecera = cabecera;
	}

	public Numeracion getNumeracionDian() {
		return numeracionDian;
	}

	public void setNumeracionDian(Numeracion numeracionDian) {
		this.numeracionDian = numeracionDian;
	}

	public Notificacion getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	public Emisor getEmisor() {
		return emisor;
	}

	public void setEmisor(Emisor emisor) {
		this.emisor = emisor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	public Extension getExtension() {
		return extension;
	}

	public void setExtension(Extension extension) {
		this.extension = extension;
	}

}
