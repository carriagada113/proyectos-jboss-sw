package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;

/**
 * Clase de transporte de los datos de entrada al servicio.
 *
 */
public class InputServicio implements Serializable {

	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Rut del usuario a consultar.
	 */
	private String rut;
	
	/**
	 * Constructor de la clase.
	 */
	public InputServicio(){}

	/**
	 * Retorna el valor del atributo rut.
	 * @return valor del atributo rut.
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * Asigna un nuevo valor para el atributo rut. 
	 * @param rut valor a asignar en el atributo rut.
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
}
