package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente extends TipologiaPersona {

    @XmlAttribute(name = "NombreComercial")
    private String nombreComercial;

    @XmlElement(name = "PersonaNatural")
    private Persona personaNatural;

    @XmlElement(name = "Direccion")
    private DireccionCliente direccion;

    @XmlElement(name = "Contacto")
    private Contacto contacto;

    @XmlElement(name = "ObligacionesCliente")
    private Obligacion obligacion;

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Persona getPersonaNatural() {
        return personaNatural;
    }

    public void setPersonaNatural(Persona personaNatural) {
        this.personaNatural = personaNatural;
    }

    public DireccionCliente getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionCliente direccion) {
        this.direccion = direccion;
    }

    public Obligacion getObligacion() {
        return obligacion;
    }

    public void setObligacion(Obligacion obligacion) {
        this.obligacion = obligacion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
