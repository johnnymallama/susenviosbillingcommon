package co.com.surenvios.librarycommon.dto.facture.mock;

import java.text.SimpleDateFormat;
import java.util.Date;

import co.com.surenvios.librarycommon.database.entity.Resolucion;
import co.com.surenvios.librarycommon.dto.facture.request.common.*;
import co.com.surenvios.librarycommon.dto.facture.request.facturaventa.*;


public class FacturaVentaMock {

	private FacturaVentaMock() {

	}

	public static FacturaVentaRequest create(Resolucion resolucion, Integer proximoConsecutivo) {
		FacturaVentaRequest retorno = new FacturaVentaRequest();
		retorno.setCabecera(createCabecera(resolucion, proximoConsecutivo));
		retorno.setNumeracionDian(createNumeracion(resolucion));
		retorno.setNotificacion(createNotificacion());
		retorno.setEmisor(createEmisor());
		retorno.setCliente(createCliente());
		retorno.setTotal(createTotal());
		retorno.setLinea(createLinea());
		return retorno;
	}

	public static Cabecera createCabecera(Resolucion resolucion, Integer proximoConsecutivo) {
		Cabecera retorno = new Cabecera();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		retorno.setNumeroFactura(resolucion.getPrefijo().concat(String.valueOf(proximoConsecutivo)));
		retorno.setFechaEmision(format.format(new Date()));
		retorno.setFechaVencimiento(format.format(new Date()));
		retorno.setHoraEmision("17:00:00");
		retorno.setMonedaFactura("COP");
		retorno.setObservaciones("FACTURA PRUEBA API");
		retorno.setTipoFactura("01");
		retorno.setFormaDePago("1");
		retorno.setLineasDeFactura("1");
		retorno.setTipoOperacion("10");
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

	public static Notificacion createNotificacion() {
		Notificacion retorno = new Notificacion();
		retorno.setTipo("Mail");
		retorno.setDe("facturacion@prueba.com");
		retorno.setPara("johnnyfabianmallama@gmail.com");
		return retorno;
	}

	public static Emisor createEmisor() {
		Emisor retorno = new Emisor();
		retorno.setTipoPersona("1");
		retorno.setTipoRegimen("49");
		retorno.setTipoIdentificacion("31");
		retorno.setNumeroIdentificacion("813000298");
		retorno.setDigitoVerificacion("7");
		retorno.setRazonSocial("SURENVIOS S.A.S.");
		retorno.setNumeroMatriculaMercantil("0002048350");
		retorno.setDireccion(createDireccion());
		retorno.setDireccionFiscal(createDireccion());
		return retorno;
	}

	public static Direccion createDireccion() {
		Direccion retorno = new Direccion();
		retorno.setCodigoMunicipio("11001");
		retorno.setNombreCiudad("BOGOTA D.C.");
		retorno.setNombreDepartamento("BOGOTÁ D.C.");
		retorno.setCodigoDepartamento("11");
		retorno.setDireccion("AUTOPISTA MEDELLIN COSTADO NORTE KM1 BODEGA 6");
		retorno.setCodigoPostal("");
		return retorno;
	}

	public static Cliente createCliente() {
		Cliente retorno = new Cliente();
		retorno.setTipoPersona("2");
		retorno.setTipoRegimen("48");
		retorno.setTipoIdentificacion("13");
		retorno.setNumeroIdentificacion("1032418122");
		retorno.setDigitoVerificacion("");
		retorno.setRazonSocial("JOHNNY MALLAMA");
		retorno.setNombreComercial("JOHNNY MALLAMA");
		retorno.setPersonaNatural(createPersona());
		retorno.setDireccion(createDireccionCliente());
		return retorno;
	}

	public static Persona createPersona() {
		Persona retorno = new Persona();
		retorno.setPrimerNombre("JOHNNY");
		retorno.setSegundoNombre("FABIAN");
		retorno.setApellido("MALLAMA");
		return retorno;
	}

	public static DireccionCliente createDireccionCliente() {
		DireccionCliente retorno = new DireccionCliente();
		retorno.setCodigoMunicipio("11001");
		retorno.setNombreCiudad("BOGOTA D.C.");
		retorno.setNombreDepartamento("BOGOTÁ D.C.");
		retorno.setCodigoDepartamento("11");
		retorno.setDireccion("CALLE SIEMPRE VIVA 50-22");
		retorno.setNombrePais("COLOMBIA");
		retorno.setCodigoPais("CO");
		retorno.setIdiomaPais("es");
		retorno.setCodigoPostal("");
		return retorno;
	}

	public static Total createTotal() {
		Total retorno = new Total();
		retorno.setBruto("1000.00");
		retorno.setBaseImponible("0.00");
		retorno.setBrutoMasImpuesto("1000.00");
		retorno.setImpuesto("0.00");
		retorno.setDescuento("0.0");
		retorno.setRetencion("0.0");
		retorno.setCargo("0.0");
		retorno.setGeneral("1000.00");
		retorno.setAnticipo("0.0");
		retorno.setRedondeo("0.0");
		retorno.setTotalDescuentoLinea("0.0");
		retorno.setTotalCargoLinea("0.0");
		return retorno;
	}

	public static Linea createLinea() {
		Linea retorno = new Linea();
		retorno.setDetalle(createLineaDetalle());
		retorno.addCodificacionEstandar(createLineaCodificacionEstandar());
		return retorno;
	}

	public static Detalle createLineaDetalle() {
		Detalle retorno = new Detalle();
		retorno.setNumeroLinea("1");
		retorno.setCantidad("1.0000");
		retorno.setUnidadMedida("94");
		retorno.setSubTotalLinea("1000.00");
		retorno.setDescripcion("PRUEBA SURENVIO API");
		retorno.setCantidadBase("1.00");
		retorno.setUnidadCantidadBase("0");
		retorno.setPrecioUnitario("1000.00");
		retorno.setValorTotalItem("1000.00");
		return retorno;
	}

	public static CodificacionEstandar createLineaCodificacionEstandar() {
		CodificacionEstandar retorno = new CodificacionEstandar();
		retorno.setCodigoArticulo("PRUEBA1");
		retorno.setCodigoEstandar("999");
		return retorno;
	}
}
