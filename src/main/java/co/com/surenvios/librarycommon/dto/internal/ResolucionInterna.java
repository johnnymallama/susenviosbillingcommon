package co.com.surenvios.librarycommon.dto.internal;

import co.com.surenvios.librarycommon.database.entity.NumeracionNcNd;
import co.com.surenvios.librarycommon.database.entity.Resolucion;

import java.util.Calendar;

public class ResolucionInterna {

    private Integer consecutivo;
    private Resolucion resolucion;

    private NumeracionNcNd numeracionNcNd;

    private Calendar fechaDocumento;

    public ResolucionInterna(Integer consecutivo, Resolucion resolucion) {
        this.consecutivo = consecutivo;
        this.resolucion = resolucion;
        this.fechaDocumento = Calendar.getInstance();
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public String numeroDocumento() {
        if (resolucion != null) {
            return resolucion.getPrefijo().concat(String.valueOf(consecutivo));
        } else if (numeracionNcNd != null) {
            return numeracionNcNd.getPrefijo().concat(String.valueOf(consecutivo));
        } else {
            throw new RuntimeException("Error created numero documento");
        }
    }

    public Calendar getFechaDocumento() {
        return fechaDocumento;
    }

    public NumeracionNcNd getNumeracionNcNd() {
        return numeracionNcNd;
    }

    public ResolucionInterna(Integer consecutivo, NumeracionNcNd numeracionNcNd) {
        this.consecutivo = consecutivo;
        this.numeracionNcNd = numeracionNcNd;
        this.fechaDocumento = Calendar.getInstance();
    }

    public String getPrefijo() {
        if (resolucion != null) {
            return resolucion.getPrefijo();
        } else if (numeracionNcNd != null) {
            return numeracionNcNd.getPrefijo();
        } else {
            throw new RuntimeException("Error get prefijo");
        }
    }
}
