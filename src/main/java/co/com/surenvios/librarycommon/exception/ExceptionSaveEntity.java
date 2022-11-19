package co.com.surenvios.librarycommon.exception;

public class ExceptionSaveEntity extends Exception {

	public ExceptionSaveEntity() {
	}

	public ExceptionSaveEntity(String message) {
		super(message);
	}

	public ExceptionSaveEntity(Throwable cause) {
		super(cause);
	}

	public ExceptionSaveEntity(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionSaveEntity(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
