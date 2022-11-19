package co.com.surenvios.librarycommon.exception;

public class ExceptionScheduled extends Exception {

	public ExceptionScheduled() {
	}

	public ExceptionScheduled(String message) {
		super(message);
	}

	public ExceptionScheduled(Throwable cause) {
		super(cause);
	}

	public ExceptionScheduled(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionScheduled(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
