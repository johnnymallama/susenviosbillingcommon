package co.com.surenvios.librarycommon.database.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "FE_EJECUCION")
public class Ejecucion {

	@Id
	@Column(name = "identificador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer identificador;

	@Column(name = "id_hilo")
	private String idHilo;

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaInicio;

	@Column(name = "fecha_fin")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fechaFin;

	@Column(name = "total_registros")
	private Integer totalRegistros;

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
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

	public void setFechaFin() {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		this.fechaFin = now;
	}

	public Integer getTotalRegistros() {
		return totalRegistros;
	}

	public void setTotalRegistros(Integer totalRegistros) {
		this.totalRegistros = totalRegistros;
	}

	public String getIdHilo() {
		return idHilo;
	}

	public void setIdHilo(String idHilo) {
		this.idHilo = idHilo;
	}

}
