package co.com.surenvios.librarycommon.exception;

public class ExceptionLogin extends Exception {

	public ExceptionLogin() {
	}

	public ExceptionLogin(String message) {
		super(message);
	}

	public ExceptionLogin(Throwable cause) {
		super(cause);
	}

	public ExceptionLogin(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionLogin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
