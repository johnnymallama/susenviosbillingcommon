package co.com.surenvios.librarycommon.dto.facture.helper;

import co.com.surenvios.librarycommon.database.entity.*;
import co.com.surenvios.librarycommon.database.view.DataNote;
import co.com.surenvios.librarycommon.dto.facture.request.common.*;
import co.com.surenvios.librarycommon.dto.facture.request.nota.*;


import static co.com.surenvios.librarycommon.util.Constants.VALUE_ZERO_TWO_DECIMAL;
import static co.com.surenvios.librarycommon.util.Constants.VALUE_ZERO_ONE_DECIMAL;
import static co.com.surenvios.librarycommon.util.Constants.TYPE_OPERATION_NOTE;
import static co.com.surenvios.librarycommon.util.Constants.VALUE_ONE;
import static co.com.surenvios.librarycommon.util.Constants.EMPTY;
import static co.com.surenvios.librarycommon.util.Constants.CODE_MEDIO_PAGO;
import static co.com.surenvios.librarycommon.util.Constants.CODE_MAIL;
import static co.com.surenvios.librarycommon.util.Constants.VALUE_ONE_TWO_DECIMAL;
import static co.com.surenvios.librarycommon.util.Constants.VALUE_ZERO;
import static co.com.surenvios.librarycommon.util.UtilText.formatDate;


public class HelperNota {

    private HelperNota() {

    }

    public static NotaCreditoRequest createNotaCredito(co.com.surenvios.librarycommon.database.view.Emisor emisor,
                                                       Acumulado acumulado, NumeracionNcNd numeracionNcNd, DataNote dataNote) {
        NotaCreditoRequest retorno = new NotaCreditoRequest();
        retorno.setCabecera(createCabecera(emisor, acumulado, numeracionNcNd, TYPE_OPERATION_NOTE));
        retorno.setMedioDePago(createMedioPago(acumulado));
        retorno.addFacturaRelacion(createFacturaRelacion(dataNote));
        retorno.setEmisor(createEmisor(emisor));
        retorno.setNotificacion(createNotificacion(emisor, acumulado));
        retorno.setCliente(createCliente(acumulado));
        retorno.setTotal(createTotal(acumulado));
        retorno.setLinea(createLinea(acumulado));
        return retorno;
    }

    public static NotaDebitoRequest createNotaDebito(co.com.surenvios.librarycommon.database.view.Emisor emisor,
                                                     Acumulado acumulado, NumeracionNcNd numeracionNcNd, DataNote dataNote) {
        NotaDebitoRequest retorno = new NotaDebitoRequest();
        retorno.setCabecera(createCabecera(emisor, acumulado, numeracionNcNd, EMPTY));
        retorno.setMedioDePago(createMedioPago(acumulado));
        retorno.addFacturaRelacion(createFacturaRelacion(dataNote));
        retorno.setEmisor(createEmisor(emisor));
        retorno.setNotificacion(createNotificacion(emisor, acumulado));
        retorno.setCliente(createCliente(acumulado));
        retorno.setTotal(createTotal(acumulado));
        retorno.setLinea(createLinea(acumulado));
        return retorno;
    }

    public static Cabecera createCabecera(co.com.surenvios.librarycommon.database.view.Emisor emisor,
                                          Acumulado acumulado, NumeracionNcNd numeracionNcNd, String tipoOperacion) {
        Cabecera retorno = new Cabecera();
        retorno.setTipoOperacion(tipoOperacion);
        retorno.setPrefijo(numeracionNcNd.getPrefijo());
        retorno.setFechaEmision(formatDate(acumulado.getFechaEmision()));
        retorno.setHoraEmision(acumulado.getHoraEmision());
        retorno.setObservaciones(acumulado.getObservacion());
        retorno.setMonedaNota(emisor.getMoneda());
        retorno.setLineasDeNota(VALUE_ONE);
        retorno.setOrdenCompra(EMPTY);
        retorno.setFormaDePago(VALUE_ONE);
        return retorno;
    }

    public static MedioPago createMedioPago(Acumulado acumulado) {
        MedioPago retorno = new MedioPago();
        retorno.setCodigoMedioPago(CODE_MEDIO_PAGO);
        retorno.setFormaDePago(String.valueOf(acumulado.getFormadePago()));
        retorno.setFechaVencimiento(EMPTY);
        return retorno;
    }

    public static FacturaRelacion createFacturaRelacion(DataNote dataNote) {
        FacturaRelacion retorno = new FacturaRelacion();
        retorno.setNumeroDocumento(dataNote.getNumeroDocumento());
        retorno.setCufe(dataNote.getCufe());
        retorno.setFechaEmision(formatDate(dataNote.getFechaEmision()));
        return retorno;
    }

    public static Notificacion createNotificacion(co.com.surenvios.librarycommon.database.view.Emisor emisor,
                                                  Acumulado acumulado) {
        Notificacion retorno = new Notificacion();
        retorno.setTipo(CODE_MAIL);
        retorno.setDe(emisor.getCorreoRemitente());
        retorno.setPara(acumulado.getCorreoCliente());
        return retorno;
    }

    public static Emisor createEmisor(co.com.surenvios.librarycommon.database.view.Emisor emisor) {
        Emisor retorno = new Emisor();
        retorno.setTipoPersona(emisor.getTipoPersona());
        retorno.setTipoRegimen(emisor.getTipoRegimen());
        retorno.setTipoIdentificacion(emisor.getTipoIdentificacion());
        retorno.setNumeroIdentificacion(emisor.getNumeroIdentificacion());
        retorno.setDigitoVerificacion(emisor.getDigitoVerificacion());
        retorno.setRazonSocial(emisor.getRazonSocial());
        retorno.setNumeroMatriculaMercantil(emisor.getMatriculaMercantil());
        Direccion direccion = createDireccion(emisor);
        retorno.setDireccion(direccion);
        retorno.setDireccionFiscal(direccion);
        retorno.setObligacion(createObligacion(emisor.getObligacion()));
        return retorno;
    }

    public static Direccion createDireccion(co.com.surenvios.librarycommon.database.view.Emisor emisor) {
        Direccion retorno = new Direccion();
        retorno.setCodigoMunicipio(emisor.getCodigoMunicipio());
        retorno.setNombreCiudad(emisor.getNombreCiudad());
        retorno.setNombreDepartamento(emisor.getNombreDepartamento());
        retorno.setCodigoDepartamento(emisor.getCodigoDepartamento());
        retorno.setDireccion(emisor.getDireccion());
        retorno.setCodigoPostal(EMPTY);
        return retorno;
    }

    public static Cliente createCliente(Acumulado acumulado) {
        Cliente retorno = new Cliente();
        retorno.setTipoPersona(acumulado.getTipoPersonaCli());
        retorno.setTipoRegimen(acumulado.getTipoRegimenCli());
        retorno.setTipoIdentificacion(acumulado.getTipoIdentificacionCliente());
        retorno.setNumeroIdentificacion(acumulado.getNumeroIdentificacionCliente());
        retorno.setDigitoVerificacion(acumulado.getDigitoVerifiCliente() == null ? EMPTY : acumulado.getDigitoVerifiCliente());
        String razonSocialNombreComercial = acumulado.getRazonSocialCliente() == null ? acumulado.getNombreComercial() : acumulado.getRazonSocialCliente();
        retorno.setRazonSocial(razonSocialNombreComercial);
        retorno.setNombreComercial(razonSocialNombreComercial);
        retorno.setPersonaNatural(createPersona(acumulado));
        retorno.setDireccion(createDireccionCliente(acumulado));
        retorno.setContacto(createContacto(acumulado.getTelefono(), acumulado.getCorreoCliente()));
        retorno.setObligacion(createObligacion(acumulado.getCodigoObligacion()));
        return retorno;
    }

    public static Persona createPersona(Acumulado acumulado) {
        Persona retorno = new Persona();
        retorno.setPrimerNombre(acumulado.getPrimerNombre());
        retorno.setSegundoNombre(acumulado.getSegundoNombre());
        retorno.setApellido(acumulado.getApellido());
        return retorno;
    }

    public static DireccionCliente createDireccionCliente(Acumulado acumulado) {
        DireccionCliente retorno = new DireccionCliente();
        retorno.setCodigoMunicipio(acumulado.getCodigoMunicipioCliente());
        retorno.setNombreCiudad(acumulado.getNombreCiudadCliente());
        retorno.setNombreDepartamento(acumulado.getNombreDepartamentoCliente());
        retorno.setCodigoDepartamento(acumulado.getCodigoDepartamentoCliente());
        retorno.setDireccion(acumulado.getDireccionCliente());
        retorno.setNombrePais(acumulado.getNombrePaisCliente());
        retorno.setCodigoPais(acumulado.getCodigoPaisCliente());
        retorno.setIdiomaPais(acumulado.getIdiomaPaisCliente());
        retorno.setCodigoPostal(EMPTY);
        return retorno;
    }

    public static Total createTotal(Acumulado acumulado) {
        Total retorno = new Total();
        retorno.setBruto(String.valueOf(acumulado.getSubtotal()));
        retorno.setBaseImponible(VALUE_ZERO_TWO_DECIMAL);
        retorno.setBrutoMasImpuesto(String.valueOf(acumulado.getTotal()));
        retorno.setImpuesto(VALUE_ZERO_TWO_DECIMAL);
        retorno.setDescuento(VALUE_ZERO_ONE_DECIMAL);
        retorno.setRetencion(VALUE_ZERO_ONE_DECIMAL);
        retorno.setCargo(VALUE_ZERO_ONE_DECIMAL);
        retorno.setGeneral(String.valueOf(acumulado.getTotal()));
        retorno.setAnticipo(VALUE_ZERO_ONE_DECIMAL);
        retorno.setRedondeo(VALUE_ZERO_ONE_DECIMAL);
        retorno.setTotalDescuentoLinea(VALUE_ZERO_ONE_DECIMAL);
        retorno.setTotalCargoLinea(VALUE_ZERO_ONE_DECIMAL);
        return retorno;
    }

    public static Linea createLinea(Acumulado acumulado) {
        Linea retorno = new Linea();
        retorno.setDetalle(createLineaDetalle(acumulado));
        retorno.addCodificacionEstandar(createLineaCodificacionEstandar(acumulado));
        return retorno;
    }

    public static Detalle createLineaDetalle(Acumulado acumulado) {
        Detalle retorno = new Detalle();
        retorno.setNumeroLinea(VALUE_ONE);
        retorno.setCantidad(VALUE_ONE);
        retorno.setUnidadMedida(acumulado.getUnidadMedida());
        retorno.setSubTotalLinea(String.valueOf(acumulado.getSubtotal()));
        retorno.setDescripcion(acumulado.getDescripcion());
        retorno.setCantidadBase(VALUE_ONE_TWO_DECIMAL);
        retorno.setUnidadCantidadBase(VALUE_ZERO);
        retorno.setPrecioUnitario(String.valueOf(acumulado.getSubtotal()));
        retorno.setValorTotalItem(String.valueOf(acumulado.getTotal()));
        return retorno;
    }

    public static CodificacionEstandar createLineaCodificacionEstandar(Acumulado acumulado) {
        CodificacionEstandar retorno = new CodificacionEstandar();
        retorno.setCodigoArticulo(acumulado.getCodigoArticulo());
        retorno.setCodigoEstandar(acumulado.getCodigoEstandar());
        return retorno;
    }

    public static Obligacion createObligacion(String codigoObligacion) {
        Obligacion retorno = new Obligacion();
        retorno.setCodigoObligacion(codigoObligacion);
        return retorno;
    }

    public static Contacto createContacto(String telefono, String email) {
        Contacto retorno = new Contacto();
        retorno.setTelefono(telefono);
        retorno.setEmail(email);
        return retorno;
    }

}
