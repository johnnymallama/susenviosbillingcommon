package co.com.surenvios.librarycommon.database.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "FE_Acumulado")
public class Acumulado {

    @Id
    @Column(name = "Identificador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identificador;

    @Column(name = "NumeroGuia")
    private String numeroGuia;

    @Column(name = "Procesar")
    private Integer procesar;

    @Column(name = "TipoDocumento")
    private String tipoDocumento;

    @Column(name = "NumeroDocumento")
    private String numeroDocumento;

    @Column(name = "FechaEmision")
    @Temporal(TemporalType.DATE)
    private Calendar fechaEmision;

    @Column(name = "FechaVencimiento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaVencimiento;

    @Column(name = "HoraEmision")
    private String horaEmision;

    @Column(name = "Observacion")
    private String observacion;

    @Column(name = "FormadePago")
    private Integer formadePago;

    @Column(name = "NumeroResolucion")
    private String numeroResolucion;

    @Column(name = "CorreoCliente")
    private String correoCliente;

    @Column(name = "TipoPersonaCli")
    private String tipoPersonaCli;

    @Column(name = "TipoRegimenCli")
    private String tipoRegimenCli;

    @Column(name = "TipoIdentificacionCli")
    private String tipoIdentificacionCliente;

    @Column(name = "NumeroIdentificacionCli")
    private String numeroIdentificacionCliente;

    @Column(name = "DigitoVerifiCli")
    private String digitoVerifiCliente;

    @Column(name = "RazonSocialCli")
    private String razonSocialCliente;

    @Column(name = "NombreComercial")
    private String nombreComercial;

    @Column(name = "PrimerNombre")
    private String primerNombre;

    @Column(name = "SegundoNombre")
    private String segundoNombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "CodigoMunicipioCli")
    private String codigoMunicipioCliente;

    @Column(name = "NombreCiudadCli")
    private String nombreCiudadCliente;

    @Column(name = "NombreDepartamentoCli")
    private String nombreDepartamentoCliente;

    @Column(name = "CodigoDepartamentoCli")
    private String codigoDepartamentoCliente;

    @Column(name = "DireccionCli")
    private String direccionCliente;

    @Column(name = "NombrePaisCli")
    private String nombrePaisCliente;

    @Column(name = "CodigoPaisCli")
    private String codigoPaisCliente;

    @Column(name = "IdiomaPaisCli")
    private String idiomaPaisCliente;

    @Column(name = "Total")
    private Integer total;

    @Column(name = "Subtotal")
    private Integer subtotal;

    @Column(name = "UnidadMedida")
    private String unidadMedida;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "CodigoArticulo")
    private String codigoArticulo;

    @Column(name = "CodigoEstandar")
    private String codigoEstandar;

    @Column(name = "EstadoDocumento")
    private Integer estadoDocumento;

    @Column(name = "DescripcionEstadoDoc")
    private String descripcionEstadoDocumento;

    @Column(name = "CodigoObligacion")
    private String codigoObligacion;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "FechaDocumento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaDocumento;

    @Column(name = "FechaEntrega")
    @Temporal(TemporalType.DATE)
    private Calendar fechaEntrega;

    @Column(name = "Origen")
    private String origen;

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public Integer getProcesar() {
        return procesar;
    }

    public void setProcesar(Integer procesar) {
        this.procesar = procesar;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(String horaEmision) {
        this.horaEmision = horaEmision;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(Integer formadePago) {
        this.formadePago = formadePago;
    }

    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getTipoPersonaCli() {
        return tipoPersonaCli;
    }

    public void setTipoPersonaCli(String tipoPersonaCli) {
        this.tipoPersonaCli = tipoPersonaCli;
    }

    public String getTipoRegimenCli() {
        return tipoRegimenCli;
    }

    public void setTipoRegimenCli(String tipoRegimenCli) {
        this.tipoRegimenCli = tipoRegimenCli;
    }

    public String getTipoIdentificacionCliente() {
        return tipoIdentificacionCliente;
    }

    public void setTipoIdentificacionCliente(String tipoIdentificacionCliente) {
        this.tipoIdentificacionCliente = tipoIdentificacionCliente;
    }

    public String getNumeroIdentificacionCliente() {
        return numeroIdentificacionCliente;
    }

    public void setNumeroIdentificacionCliente(String numeroIdentificacionCliente) {
        this.numeroIdentificacionCliente = numeroIdentificacionCliente;
    }

    public String getDigitoVerifiCliente() {
        return digitoVerifiCliente;
    }

    public void setDigitoVerifiCliente(String digitoVerifiCliente) {
        this.digitoVerifiCliente = digitoVerifiCliente;
    }

    public String getRazonSocialCliente() {
        return razonSocialCliente;
    }

    public void setRazonSocialCliente(String razonSocialCliente) {
        this.razonSocialCliente = razonSocialCliente;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoMunicipioCliente() {
        return codigoMunicipioCliente;
    }

    public void setCodigoMunicipioCliente(String codigoMunicipioCliente) {
        this.codigoMunicipioCliente = codigoMunicipioCliente;
    }

    public String getNombreCiudadCliente() {
        return nombreCiudadCliente;
    }

    public void setNombreCiudadCliente(String nombreCiudadCliente) {
        this.nombreCiudadCliente = nombreCiudadCliente;
    }

    public String getNombreDepartamentoCliente() {
        return nombreDepartamentoCliente;
    }

    public void setNombreDepartamentoCliente(String nombreDepartamentoCliente) {
        this.nombreDepartamentoCliente = nombreDepartamentoCliente;
    }

    public String getCodigoDepartamentoCliente() {
        return codigoDepartamentoCliente;
    }

    public void setCodigoDepartamentoCliente(String codigoDepartamentoCliente) {
        this.codigoDepartamentoCliente = codigoDepartamentoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getNombrePaisCliente() {
        return nombrePaisCliente;
    }

    public void setNombrePaisCliente(String nombrePaisCliente) {
        this.nombrePaisCliente = nombrePaisCliente;
    }

    public String getCodigoPaisCliente() {
        return codigoPaisCliente;
    }

    public void setCodigoPaisCliente(String codigoPaisCliente) {
        this.codigoPaisCliente = codigoPaisCliente;
    }

    public String getIdiomaPaisCliente() {
        return idiomaPaisCliente;
    }

    public void setIdiomaPaisCliente(String idiomaPaisCliente) {
        this.idiomaPaisCliente = idiomaPaisCliente;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

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

    public Integer getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(Integer estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    public String getDescripcionEstadoDocumento() {
        return descripcionEstadoDocumento;
    }

    public void setDescripcionEstadoDocumento(String descripcionEstadoDocumento) {
        this.descripcionEstadoDocumento = descripcionEstadoDocumento;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigoObligacion() {
        return codigoObligacion;
    }

    public void setCodigoObligacion(String codigoObligacion) {
        this.codigoObligacion = codigoObligacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Calendar fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
