package exception;

public class CensusAnalyserException extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionType type;

	public CensusAnalyserException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}

	public CensusAnalyserException(String message, String name) {
		super(message);
		this.type = ExceptionType.valueOf(name);
	}

	public enum ExceptionType {
		INCORRECT_FILE, IMPROPER_CSV
	}

}
