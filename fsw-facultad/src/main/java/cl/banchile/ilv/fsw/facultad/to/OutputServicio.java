package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;

/**
 * Clase de transporte de los datos de salida del servicio.
 *
 */
public class OutputServicio implements Serializable {
	
	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Header de la respuesta.
	 */
	private ResponseHeader responseHeader;
	/**
	 * Body de la respuesta.
	 */
	private ResponseBody responseBody;
	/**
	 * Retorna el valor del atributo responseHeader.
	 * @return valor del atributo responseHeader.
	 */
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	/**
	 * Asigna un nuevo valor para el atributo responseHeader. 
	 * @param responseHeader valor a asignar en el atributo responseHeader.
	 */
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	/**
	 * Retorna el valor del atributo responseBody.
	 * @return valor del atributo responseBody.
	 */
	public ResponseBody getResponseBody() {
		return responseBody;
	}
	/**
	 * Asigna un nuevo valor para el atributo responseBody. 
	 * @param responseBody valor a asignar en el atributo responseBody.
	 */
	public void setResponseBody(ResponseBody responseBody) {
		this.responseBody = responseBody;
	}
	
}
