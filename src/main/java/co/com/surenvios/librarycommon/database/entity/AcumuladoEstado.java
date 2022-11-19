package co.com.surenvios.librarycommon.database.entity;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "FE_ACUMULADO_ESTADO")
public class AcumuladoEstado {

	@Column(name = "NumeroDocumento")
	private String numeroDocumento;

	@Id
	@Column(name = "IdentificadorRespuesta")
	private String identificadorRespuesta;

	@Column(name = "Cufe")
	private String cufe;

	@Column(name = "UrlConsultaDocumento")
	private String urlConsultaDocumento;

	@Column(name = "UrlDocumentoPdf")
	private String urlDocumentoPdf;

	@Column(name = "UrlDocumentoXml")
	private String urlDocumentoXml;

	@Column(name = "NombreDocumentoPdf")
	private String nombreDocumentoPdf;

	@Column(name = "NombreDocumentoXml")
	private String nombreDocumentoXml;

	@Column(name = "FechaRegistro")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaRegistro;

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getIdentificadorRespuesta() {
		return identificadorRespuesta;
	}

	public void setIdentificadorRespuesta(String identificadorRespuesta) {
		this.identificadorRespuesta = identificadorRespuesta;
	}

	public String getCufe() {
		return cufe;
	}

	public void setCufe(String cufe) {
		this.cufe = cufe;
	}

	public String getUrlConsultaDocumento() {
		return urlConsultaDocumento;
	}

	public void setUrlConsultaDocumento(String urlConsultaDocumento) {
		this.urlConsultaDocumento = urlConsultaDocumento;
	}

	public String getUrlDocumentoPdf() {
		return urlDocumentoPdf;
	}

	public void setUrlDocumentoPdf(String urlDocumentoPdf) {
		this.urlDocumentoPdf = urlDocumentoPdf;
	}

	public String getUrlDocumentoXml() {
		return urlDocumentoXml;
	}

	public void setUrlDocumentoXml(String urlDocumentoXml) {
		this.urlDocumentoXml = urlDocumentoXml;
	}

	public String getNombreDocumentoPdf() {
		return nombreDocumentoPdf;
	}

	public void setNombreDocumentoPdf(String nombreDocumentoPdf) {
		this.nombreDocumentoPdf = nombreDocumentoPdf;
	}

	public String getNombreDocumentoXml() {
		return nombreDocumentoXml;
	}

	public void setNombreDocumentoXml(String nombreDocumentoXml) {
		this.nombreDocumentoXml = nombreDocumentoXml;
	}

	public Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
