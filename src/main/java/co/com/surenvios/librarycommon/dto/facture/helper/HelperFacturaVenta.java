package co.com.surenvios.librarycommon.dto.facture.helper;

import java.text.SimpleDateFormat;

import co.com.surenvios.librarycommon.database.entity.*;
import co.com.surenvios.librarycommon.dto.facture.request.common.*;
import co.com.surenvios.librarycommon.dto.facture.request.facturaventa.*;
import co.com.surenvios.librarycommon.util.UtilText;

public class HelperFacturaVenta {

	private HelperFacturaVenta() {

	}

	public static FacturaVentaRequest create(Resolucion resolucion,
			co.com.surenvios.librarycommon.database.view.Emisor emisor, Acumulado acumulado) {
		FacturaVentaRequest retorno = new FacturaVentaRequest();
		retorno.setCabecera(createCabecera(emisor, acumulado));
		retorno.setMedioDePago(createMedioPago(acumulado));
		retorno.setNumeracionDian(createNumeracion(resolucion));
		retorno.setNotificacion(createNotificacion(emisor, acumulado));
		retorno.setEmisor(createEmisor(emisor));
		retorno.setCliente(createCliente(acumulado));
		retorno.setTotal(createTotal(acumulado));
		retorno.setLinea(createLinea(acumulado));
		retorno.setExtension(HelperExtension.create(acumulado.getObservacion(),
				UtilText.cantidadConLetra(String.valueOf(acumulado.getTotal()))));
		return retorno;
	}

	public static Cabecera createCabecera(co.com.surenvios.librarycommon.database.view.Emisor emisor,
			Acumulado acumulado) {
		Cabecera retorno = new Cabecera();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		retorno.setFechaEmision(format.format(acumulado.getFechaEmision().getTime()));
		retorno.setFechaVencimiento(format.format(acumulado.getFechaVencimiento().getTime()));
		retorno.setHoraEmision(acumulado.getHoraEmision());
		retorno.setMonedaFactura(emisor.getMoneda());
		retorno.setObservaciones(acumulado.getObservacion());
		retorno.setTipoFactura("01");
		retorno.setFormaDePago(String.valueOf(acumulado.getFormadePago()));
		retorno.setLineasDeFactura("1");
		retorno.setTipoOperacion("10");
		return retorno;
	}

	public static MedioPago createMedioPago (Acumulado acumulado){
		MedioPago retorno = new MedioPago();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		retorno.setCodigoMedioPago("ZZZ");
		retorno.setFormaDePago(String.valueOf(acumulado.getFormadePago()));
		retorno.setFechaVencimiento(format.format(acumulado.getFechaVencimiento().getTime()));
		return retorno;
	}

	public static Numeracion createNumeracion(Resolucion resolucion) {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		Numeracion retorno = new Numeracion();
		retorno.setNumeroResolucion(resolucion.getNumeroResolucion());
		retorno.setFechaInicio(formatDate.format(resolucion.getFechaInicio().getTime()));
		retorno.setFechaFin(formatDate.format(resolucion.getFechaFin().getTime()));
		retorno.setPrefijoNumeracion(resolucion.getPrefijo());
		retorno.setConsecutivoInicial(String.valueOf(resolucion.getConsecutivoInicial()));
		retorno.setConsecutivoFinal(String.valueOf(resolucion.getConsecutivoFinal()));
		return retorno;
	}

	public static Notificacion createNotificacion(co.com.surenvios.librarycommon.database.view.Emisor emisor,
			Acumulado acumulado) {
		Notificacion retorno = new Notificacion();
		retorno.setTipo("Mail");
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
		retorno.setCodigoPostal("");
		return retorno;
	}

	public static Cliente createCliente(Acumulado acumulado) {
		Cliente retorno = new Cliente();
		retorno.setTipoPersona(acumulado.getTipoPersonaCli());
		retorno.setTipoRegimen(acumulado.getTipoRegimenCli());
		retorno.setTipoIdentificacion(acumulado.getTipoIdentificacionCliente());
		retorno.setNumeroIdentificacion(acumulado.getNumeroIdentificacionCliente());
		retorno.setDigitoVerificacion(acumulado.getDigitoVerifiCliente() == null ? "" : acumulado.getDigitoVerifiCliente());
		String nombreComercialRazonSocial = acumulado.getRazonSocialCliente() == null ? acumulado.getNombreComercial()
				: acumulado.getRazonSocialCliente();
		retorno.setRazonSocial(nombreComercialRazonSocial);
		retorno.setNombreComercial(nombreComercialRazonSocial);
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
		retorno.setCodigoPostal("");
		return retorno;
	}

	public static Contacto createContacto(String telefono, String email){
		Contacto retorno = new Contacto();
		retorno.setTelefono(telefono);
		retorno.setEmail(email);
		return retorno;
	}

	public static Total createTotal(Acumulado acumulado) {
		Total retorno = new Total();
		retorno.setBruto(String.valueOf(acumulado.getSubtotal()));
		retorno.setBaseImponible("0.00");
		retorno.setBrutoMasImpuesto(String.valueOf(acumulado.getTotal()));
		retorno.setImpuesto("0.00");
		retorno.setDescuento("0.0");
		retorno.setRetencion("0.0");
		retorno.setCargo("0.0");
		retorno.setGeneral(String.valueOf(acumulado.getTotal()));
		retorno.setAnticipo("0.0");
		retorno.setRedondeo("0.0");
		retorno.setTotalDescuentoLinea("0.0");
		retorno.setTotalCargoLinea("0.0");
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
		retorno.setNumeroLinea("1");
		retorno.setCantidad("1");
		retorno.setUnidadMedida(acumulado.getUnidadMedida());
		retorno.setSubTotalLinea(String.valueOf(acumulado.getSubtotal()));
		retorno.setDescripcion(acumulado.getDescripcion());
		retorno.setCantidadBase("1.00");
		retorno.setUnidadCantidadBase("0");
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

	public static Obligacion createObligacion(String codigoObligacion){
		Obligacion retorno = new Obligacion();
		retorno.setCodigoObligacion(codigoObligacion);
		return retorno;
	}

}
