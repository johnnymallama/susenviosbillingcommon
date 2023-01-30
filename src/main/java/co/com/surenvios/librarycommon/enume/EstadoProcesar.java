package co.com.surenvios.librarycommon.enume;

public enum EstadoProcesar {

    NO_PROCESADO(0, "No Procesado"),
    EN_PROCESO(1, "En Proceso"),
    PROCESADO(2, "Procesado");

    private int codigo;
    private String descripcion;

    private EstadoProcesar(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
