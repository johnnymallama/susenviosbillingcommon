package co.com.surenvios.librarycommon.exception;

public class ExceptionConverter extends Exception {

	public ExceptionConverter() {
	}

	public ExceptionConverter(String message) {
		super(message);
	}

	public ExceptionConverter(Throwable cause) {
		super(cause);
	}

	public ExceptionConverter(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionConverter(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
