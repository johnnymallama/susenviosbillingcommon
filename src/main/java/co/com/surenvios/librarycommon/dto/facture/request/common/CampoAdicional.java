package co.com.surenvios.librarycommon.dto.facture.request.common;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class CampoAdicional {

	public static final String TEXTO_INFERIOR_PREFIX = "TextoInferior";
	public static final String VALOR_LETRAS = "ValorLetra";

	@XmlAttribute(name = "nombre")
	private String nombre;

	@XmlAttribute(name = "valor")
	private String valor;

	public CampoAdicional(String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
