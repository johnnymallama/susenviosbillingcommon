package co.com.surenvios.librarycommon.database.view;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "FE_DATA_NOTE")
public class DataNote {

    @Id
    @Column(name = "Identificador")
    private Integer identificador;

    @Column(name = "NumeroDocumento")
    private String numeroDocumento;

    @Column(name = "FechaEmision")
    @Temporal(TemporalType.DATE)
    private Calendar fechaEmision;

    @Column(name = "Cufe")
    private String cufe;

    @Column(name = "Total")
    private Integer total;

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCufe() {
        return cufe;
    }

    public void setCufe(String cufe) {
        this.cufe = cufe;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
