package co.com.surenvios.librarycommon.database.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Calendar;

@Entity
@Table(name = "T0400009")
public class T040009 {

    @EmbeddedId
    private IdT040009 idT040009;

    @Column(name = "Cod_Regional_FExterna")
    private int codRegionalFExterna;

    @Column(name = "Cons_FExterna")
    private BigInteger consFExterna;

    @Column(name = "Fec_FExterna")
    @Temporal(TemporalType.DATE)
    private Calendar fecFExterna;

    @Column(name = "Pref_Factura")
    private String prefFactura;

    public T040009() {
    }

    public T040009(IdT040009 idT040009, int codRegionalFExterna, BigInteger consFExterna, Calendar fecFExterna, String prefFactura) {
        this.idT040009 = idT040009;
        this.codRegionalFExterna = codRegionalFExterna;
        this.consFExterna = consFExterna;
        this.fecFExterna = fecFExterna;
        this.prefFactura = prefFactura;
    }

    public IdT040009 getIdT040009() {
        return idT040009;
    }

    public void setIdT040009(IdT040009 idT040009) {
        this.idT040009 = idT040009;
    }

    public int getCodRegionalFExterna() {
        return codRegionalFExterna;
    }

    public void setCodRegionalFExterna(int codRegionalFExterna) {
        this.codRegionalFExterna = codRegionalFExterna;
    }

    public BigInteger getConsFExterna() {
        return consFExterna;
    }

    public void setConsFExterna(BigInteger consFExterna) {
        this.consFExterna = consFExterna;
    }

    public Calendar getFecFExterna() {
        return fecFExterna;
    }

    public void setFecFExterna(Calendar fecFExterna) {
        this.fecFExterna = fecFExterna;
    }

    public String getPrefFactura() {
        return prefFactura;
    }

    public void setPrefFactura(String prefFactura) {
        this.prefFactura = prefFactura;
    }
}
