package co.com.surenvios.librarycommon.util;

import java.io.StringWriter;

import javax.xml.bind.*;

import co.com.surenvios.librarycommon.exception.ExceptionConverter;

public class XmlConverter {

	private XmlConverter() {

	}

	public static String convertClassToString(Object object) throws ExceptionConverter {
		String retorno = "";
		try {
			StringWriter stringWriter = new StringWriter();
			JAXBContext jAXBContext = JAXBContext.newInstance(object.getClass());
			Marshaller jAXBMarshaller = jAXBContext.createMarshaller();
			jAXBMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jAXBMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			jAXBMarshaller.marshal(object, stringWriter);
			retorno = stringWriter.toString();
		} catch (Exception e) {
			throw new ExceptionConverter("Error convirtiendo clase a cadena", e);
		}
		return retorno;
	}

}
