package co.com.surenvios.librarycommon.dto.facture.request.login;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Clase que define los atributos para autenticacion contra FACTURE
 *
 * @author Johnny Mallama
 */
public class LoginFactureRequest implements Serializable {

    /**
     * Usuario
     */
    @JsonProperty(value = "u")
    private String user;

    /**
     * Contraseña
     */
    @JsonProperty(value = "p")
    private String password;

    public LoginFactureRequest(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
