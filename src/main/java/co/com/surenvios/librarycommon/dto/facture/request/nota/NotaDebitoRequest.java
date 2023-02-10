package co.com.surenvios.librarycommon.dto.facture.request.nota;

import javax.xml.bind.annotation.*;

import co.com.surenvios.librarycommon.dto.facture.request.common.*;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "NotaDebito")
@XmlAccessorType(XmlAccessType.FIELD)
public class NotaDebitoRequest {

    @XmlElement(name = "Cabecera")
    private Cabecera cabecera;

    @XmlElement(name = "MediosDePago")
    private MedioPago medioDePago;

    @XmlElementWrapper(name = "FacturasRelacionadas")
    @XmlElement(name = "FacturaRelacionada")
    private List<FacturaRelacion> facturaRelacion;

    @XmlElement(name = "Emisor")
    private Emisor emisor;

    @XmlElement(name = "Cliente")
    private Cliente cliente;

    @XmlElement(name = "Totales")
    private Total total;

    @XmlElement(name = "Linea")
    private Linea linea;

    @XmlElement(name = "Notificacion")
    private Notificacion notificacion;

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
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

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public MedioPago getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(MedioPago medioDePago) {
        this.medioDePago = medioDePago;
    }

    public List<FacturaRelacion> getFacturaRelacion() {
        return facturaRelacion;
    }

    public void setFacturaRelacion(List<FacturaRelacion> facturaRelacion) {
        this.facturaRelacion = facturaRelacion;
    }

    public void addFacturaRelacion(FacturaRelacion facturaRelacion) {
        if (this.facturaRelacion == null) {
            this.facturaRelacion = new ArrayList<>();
        }
        this.facturaRelacion.add(facturaRelacion);
    }
}
