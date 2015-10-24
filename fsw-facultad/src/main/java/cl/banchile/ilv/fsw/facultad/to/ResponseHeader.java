package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;
/**
 * Clase de transporte de los datos del header de la salida del servicio.
 *
 */
public class ResponseHeader implements Serializable {
	
	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Nombre de la compañía.
	 */
	private String company;
	/**
	 * Descripción del servicio.
	 */
	private String description;
	/**
	 * Constructor de la clase.
	 */
	public ResponseHeader(){}
	/**
	 * Retorna el valor del atributo company.
	 * @return valor del atributo company.
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * Asigna un nuevo valor para el atributo company. 
	 * @param company valor a asignar en el atributo company.
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * Retorna el valor del atributo description.
	 * @return valor del atributo description.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Asigna un nuevo valor para el atributo description. 
	 * @param description valor a asignar en el atributo description.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
