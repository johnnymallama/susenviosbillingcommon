package co.com.surenvios.librarycommon.enume;

public enum EstadoDocumento {

    NO_ENVIADO(0, "No Enviado"),
    ENVIADO(1, "Enviado"),
    EXITOSA(2, "Exitosa"),
    ERROR(3, "Error"),
    CORREGIDO(4, "Corregido");

    private int codigo;
    private String descripcion;

    private EstadoDocumento(int codigo, String descripcion) {
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
