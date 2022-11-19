package co.com.surenvios.librarycommon.exception;

public class ExceptionSend extends Exception {

	public ExceptionSend() {
	}

	public ExceptionSend(String message) {
		super(message);
	}

	public ExceptionSend(Throwable cause) {
		super(cause);
	}

	public ExceptionSend(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionSend(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
