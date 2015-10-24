package cl.banchile.ilv.fsw.facultad.exception;

/**
 * Clase que representa una excepción controlada del servicio.
 *
 */
public class IlvException extends Exception {

	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Mensaje de error a desplegar.
	 */
	private String message;
	/**
	 * Constructor de la clase.
	 */
	public IlvException() {
		super();
	}
	/**
	 * Constructor de la clase.
	 */
	public IlvException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	/**
	 * Constructor de la clase.
	 */
	public IlvException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * Constructor de la clase.
	 */
	public IlvException(String message) {
		super(message);
	}
	/**
	 * Constructor de la clase.
	 */
	public IlvException(Throwable cause) {
		super(cause);
		this.message = cause.getMessage();
	}

	/**
	 * Retorna el valor del atributo message.
	 * @return valor del atributo message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Asigna un nuevo valor para el atributo message. 
	 * @param message valor a asignar en el atributo message.
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
