package co.com.surenvios.librarycommon.database.helper;

import java.util.Calendar;
import java.util.Date;

import co.com.surenvios.librarycommon.database.entity.*;
import co.com.surenvios.librarycommon.dto.facture.response.common.ResponseFacture;

public class HelperAcumuladoEstado {

	private HelperAcumuladoEstado() {

	}

	public static AcumuladoEstado createAcumuladoEstado(ResponseFacture facturaVentaResponse) {
		AcumuladoEstado retorno = new AcumuladoEstado();
		retorno.setNumeroDocumento(facturaVentaResponse.getDocumentNumber());
		retorno.setIdentificadorRespuesta(facturaVentaResponse.getRequestId());
		retorno.setCufe(facturaVentaResponse.getUUID());
		retorno.setUrlConsultaDocumento(facturaVentaResponse.getURL());
		retorno.setUrlDocumentoPdf(facturaVentaResponse.getUrlPdf());
		retorno.setUrlDocumentoXml(facturaVentaResponse.getUrlXml());
		retorno.setNombreDocumentoPdf(facturaVentaResponse.getPdfFileName());
		retorno.setNombreDocumentoXml(facturaVentaResponse.getXmlFileName());
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		retorno.setFechaRegistro(now);
		return retorno;
	}

}
