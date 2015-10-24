package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;

/**
 * Clase de transporte de los datos del usuario consultado.
 *
 */
public class UsuarioTO implements Serializable {

	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Id del registro.
	 */
	private int id;
	/**
	 * Rut del usuario.
	 */
	private String rut;
	/**
	 * Nombre de usuario en el sistema.
	 */
	private String username;
	/**
	 * Nombre del usuario.
	 */
	private String nombre;
	/**
	 * Apellido paterno.
	 */
	private String apaterno;
	/**
	 * Apellido materno.
	 */
	private String amaterno;

	/**
	 * Constructor de la clase.
	 */
	public UsuarioTO(){}

	/**
	 * Retorna el valor del atributo id.
	 * @return valor del atributo id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Asigna un nuevo valor para el atributo id. 
	 * @param id valor a asignar en el atributo id.
	 */
	public void setId(int id) {
		this.id = id;
	}

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

	/**
	 * Retorna el valor del atributo username.
	 * @return valor del atributo username.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Asigna un nuevo valor para el atributo username. 
	 * @param username valor a asignar en el atributo username.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Retorna el valor del atributo nombre.
	 * @return valor del atributo nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nuevo valor para el atributo nombre. 
	 * @param nombre valor a asignar en el atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el valor del atributo apaterno.
	 * @return valor del atributo apaterno.
	 */
	public String getApaterno() {
		return apaterno;
	}

	/**
	 * Asigna un nuevo valor para el atributo apaterno. 
	 * @param apaterno valor a asignar en el atributo apaterno.
	 */
	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	/**
	 * Retorna el valor del atributo amaterno.
	 * @return valor del atributo amaterno.
	 */
	public String getAmaterno() {
		return amaterno;
	}

	/**
	 * Asigna un nuevo valor para el atributo amaterno. 
	 * @param amaterno valor a asignar en el atributo amaterno.
	 */
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

}
