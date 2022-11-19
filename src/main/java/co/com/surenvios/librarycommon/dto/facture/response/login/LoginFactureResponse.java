package co.com.surenvios.librarycommon.dto.facture.response.login;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase que define los atributos de respuesta de autenticacion contra FACTURE
 *
 * @author Johnny Mallama
 */
public class LoginFactureResponse implements Serializable {

    /**
     * Nombre visual de usuario
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Token de acceso
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * Identificador de FACTURE
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

}
