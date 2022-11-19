package co.com.surenvios.librarycommon.exception;

public class ExceptionGeneral extends Exception {

	public ExceptionGeneral() {
	}

	public ExceptionGeneral(String message) {
		super(message);
	}

	public ExceptionGeneral(Throwable cause) {
		super(cause);
	}

	public ExceptionGeneral(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionGeneral(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
