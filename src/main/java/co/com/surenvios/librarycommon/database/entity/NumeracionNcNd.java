package co.com.surenvios.librarycommon.database.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "FE_NUMERACION_NC_ND")
@NamedStoredProcedureQuery(name = "NumeracionNcNd.ProximaConsecutivoNumeracion", procedureName = "ProximaConsecutivoNumeracion", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "pi_Tipo_Documento", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "pi_Origen", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "po_Consecutivo_Proximo", type = Integer.class) })
public class NumeracionNcNd {

	@Id
	@Column(name = "TipoDocumento")
	private String tipoDocumento;

	@Column(name = "FechaRegistro")
	@Temporal(TemporalType.DATE)
	private Calendar fechaRegistro;

	@Column(name = "Prefijo")
	private String prefijo;

	@Column(name = "ConsecutivoInicial")
	private Integer consecutivoInicial;

	@Column(name = "ConsecutivoProximo")
	private Integer consecutivoProximo;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "Origen")
	private String origen;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public Integer getConsecutivoInicial() {
		return consecutivoInicial;
	}

	public void setConsecutivoInicial(Integer consecutivoInicial) {
		this.consecutivoInicial = consecutivoInicial;
	}

	public Integer getConsecutivoProximo() {
		return consecutivoProximo;
	}

	public void setConsecutivoProximo(Integer consecutivoProximo) {
		this.consecutivoProximo = consecutivoProximo;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
}
