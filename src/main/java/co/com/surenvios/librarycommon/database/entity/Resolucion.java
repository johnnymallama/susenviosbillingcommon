package co.com.surenvios.librarycommon.database.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "FE_RESOLUCION", catalog = "dbo")
@NamedStoredProcedureQuery(name = "Resolucion.ProximaConsecutivoResolucion", procedureName = "ProximaConsecutivoResolucion", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "pi_Numero_Resolucion", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "pi_Origen", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "po_Consecutivo_Proximo", type = Integer.class) })
public class Resolucion {

	@Id
	@Column(name = "numero_resolucion")
	private String numeroResolucion;

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Calendar fechaInicio;

	@Column(name = "fecha_fin")
	@Temporal(TemporalType.DATE)
	private Calendar fechaFin;

	@Column(name = "prefijo")
	private String prefijo;

	@Column(name = "consecutivo_inicial")
	private Integer consecutivoInicial;

	@Column(name = "consecutivo_final")
	private Integer consecutivoFinal;

	@Column(name = "consecutivo_proximo")
	private Integer consecutivoProximo;

	@Column(name = "llave_tecnica")
	private String llaveTecnica;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "Origen")
	private String origen;

	public String getNumeroResolucion() {
		return numeroResolucion;
	}

	public void setNumeroResolucion(String numeroResolucion) {
		this.numeroResolucion = numeroResolucion;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
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

	public Integer getConsecutivoFinal() {
		return consecutivoFinal;
	}

	public void setConsecutivoFinal(Integer consecutivoFinal) {
		this.consecutivoFinal = consecutivoFinal;
	}

	public Integer getConsecutivoProximo() {
		return consecutivoProximo;
	}

	public void setConsecutivoProximo(Integer consecutivoProximo) {
		this.consecutivoProximo = consecutivoProximo;
	}

	public String getLlaveTecnica() {
		return llaveTecnica;
	}

	public void setLlaveTecnica(String llaveTecnica) {
		this.llaveTecnica = llaveTecnica;
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
