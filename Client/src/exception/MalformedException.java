package exception;

public class MalformedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2398225996773984095L;
	private String message;

	public MalformedException() {
	}

	public String getMessage() {
		return message;
	}

	public MalformedException(String message) {
		super(message);
		this.message = message;
	}

	public MalformedException(Throwable cause) {
		super(cause);
	}

	public MalformedException(String message, Throwable cause) {
		super(message, cause);
	}
}
