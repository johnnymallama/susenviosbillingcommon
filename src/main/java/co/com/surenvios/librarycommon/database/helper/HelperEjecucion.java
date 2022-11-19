package co.com.surenvios.librarycommon.database.helper;

import java.util.Calendar;
import java.util.Date;

import co.com.surenvios.librarycommon.database.entity.Ejecucion;

public class HelperEjecucion {

	private HelperEjecucion() {

	}

	public static Ejecucion create(int totalRegistros, String idHilo) {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		Ejecucion retorno = new Ejecucion();
		retorno.setFechaInicio(now);
		retorno.setIdHilo(idHilo);
		retorno.setTotalRegistros(totalRegistros);
		return retorno;
	}

}
