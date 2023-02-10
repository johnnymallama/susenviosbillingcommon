package co.com.surenvios.librarycommon.dto.facture.helper;

import java.util.*;

import co.com.surenvios.librarycommon.dto.facture.request.common.*;

public class HelperExtension {

    private HelperExtension() {

    }

    public static Extension create(String observacion, String valorLetras) {
        Extension retorno = new Extension();
        retorno.setCampoAdicional(createCampoAdicional(observacion, valorLetras));
        return retorno;
    }

    public static List<CampoAdicional> createCampoAdicional(String observacion, String valorLetras) {
        List<CampoAdicional> retorno = new ArrayList<CampoAdicional>();
        retorno.add(new CampoAdicional(CampoAdicional.TEXTO_INFERIOR_PREFIX.concat("1"),
                observacion));
        retorno.add(new CampoAdicional(CampoAdicional.VALOR_LETRAS, valorLetras));
        return retorno;
    }

}
