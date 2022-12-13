package co.com.surenvios.librarycommon.database.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class IdT040009 implements Serializable {

    @Column(name = "Transportadora")
    private String transportadora;

    @Column(name = "Nguia")
    private String nGuia;

    @Column(name = "Otro")
    private int otro;

    public IdT040009() {
    }

    public IdT040009(String transportadora, String nGuia, int otro) {
        this.transportadora = transportadora;
        this.nGuia = nGuia;
        this.otro = otro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportadora, nGuia, otro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IdT040009 idT040009 = (IdT040009) obj;
        return this.transportadora.equals(idT040009.transportadora) && nGuia.equals(idT040009.nGuia) && otro == idT040009.otro;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public String getnGuia() {
        return nGuia;
    }

    public void setnGuia(String nGuia) {
        this.nGuia = nGuia;
    }

    public int getOtro() {
        return otro;
    }

    public void setOtro(int otro) {
        this.otro = otro;
    }
}
