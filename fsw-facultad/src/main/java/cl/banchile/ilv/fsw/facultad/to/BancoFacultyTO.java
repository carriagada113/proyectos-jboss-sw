package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;

/**
 * Clase de transporte de los datos del usuario consultado.
 *
 */
public class BancoFacultyTO implements Serializable {

	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Id del registro.
	 */
	private int identificador;
	/**
	 * Nombre de la facultad.
	 */
	private String nombre;
	/**
	 * Id banco.
	 */
	private String idBanco;
	/**
	 * Indica si facukltad se encuentra activo.
	 */
	private String indicaActivo;

	/**
	 * Constructor de la clase.
	 */
	public BancoFacultyTO(){}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIndicaActivo() {
		return indicaActivo;
	}

	public void setIndicaActivo(String indicaActivo) {
		this.indicaActivo = indicaActivo;
	}

	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}

	
}
