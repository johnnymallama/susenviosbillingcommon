package co.com.surenvios.librarycommon.database.view;

import javax.persistence.*;

@Entity
@Table(name = "FE_EMISOR")
public class Emisor {

    @Column(name = "TipoPersona")
    private String tipoPersona;

    @Column(name = "TipoRegimen")
    private String tipoRegimen;

    @Column(name = "TipoIdentificacion")
    private String tipoIdentificacion;

    @Id
    @Column(name = "NumeroIdentificacion")
    private String numeroIdentificacion;

    @Column(name = "DigitoVerificacion")
    private String digitoVerificacion;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "MatriculaMercantil")
    private String matriculaMercantil;

    @Column(name = "CodigoMunicipio")
    private String codigoMunicipio;

    @Column(name = "NombreCiudad")
    private String nombreCiudad;

    @Column(name = "NombreDepartamento")
    private String nombreDepartamento;

    @Column(name = "CodigoDepartamento")
    private String codigoDepartamento;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Moneda")
    private String moneda;

    @Column(name = "Correo")
    private String correoRemitente;

    @Column(name = "Obligacion")
    private String obligacion;

    @Column(name = "Origen")
    private String origen;

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoRegimen() {
        return tipoRegimen;
    }

    public void setTipoRegimen(String tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDigitoVerificacion() {
        return digitoVerificacion;
    }

    public void setDigitoVerificacion(String digitoVerificacion) {
        this.digitoVerificacion = digitoVerificacion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getMatriculaMercantil() {
        return matriculaMercantil;
    }

    public void setMatriculaMercantil(String matriculaMercantil) {
        this.matriculaMercantil = matriculaMercantil;
    }

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
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCorreoRemitente() {
        return correoRemitente;
    }

    public void setCorreoRemitente(String correoRemitente) {
        this.correoRemitente = correoRemitente;
    }

    public String getObligacion() {
        return obligacion;
    }

    public void setObligacion(String obligacion) {
        this.obligacion = obligacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
