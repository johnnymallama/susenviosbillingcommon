package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Emisor extends TipologiaPersona {

    @XmlAttribute(name = "NumeroMatriculaMercantil")
    private String numeroMatriculaMercantil;

    @XmlElement(name = "Direccion")
    private Direccion direccion;

    @XmlElement(name = "DireccionFiscal")
    private Direccion direccionFiscal;

    @XmlElement(name = "ObligacionesEmisor")
    private Obligacion obligacion;

    public String getNumeroMatriculaMercantil() {
        return numeroMatriculaMercantil;
    }

    public void setNumeroMatriculaMercantil(String numeroMatriculaMercantil) {
        this.numeroMatriculaMercantil = numeroMatriculaMercantil;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(Direccion direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public Obligacion getObligacion() {
        return obligacion;
    }

    public void setObligacion(Obligacion obligacion) {
        this.obligacion = obligacion;
    }
}
