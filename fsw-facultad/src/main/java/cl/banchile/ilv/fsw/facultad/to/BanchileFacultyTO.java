package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;

/**
 * Clase de transporte de los datos del usuario consultado.
 *
 */
public class BanchileFacultyTO implements Serializable {

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
	 * Facultad hija.
	 */
	private String hija;
	/**
	 * Id tipo informe.
	 */
	private String idTipoInforme;
	/**
	 * Descripcion.
	 */
	private String descripcion;
	/**
	 * Indica si facukltad se encuentra activo.
	 */
	private String indicaActivo;
	
	public BanchileFacultyTO(){}

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

	public String getHija() {
		return hija;
	}

	public void setHija(String hija) {
		this.hija = hija;
	}

	public String getIdTipoInforme() {
		return idTipoInforme;
	}

	public void setIdTipoInforme(String idTipoInforme) {
		this.idTipoInforme = idTipoInforme;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIndicaActivo() {
		return indicaActivo;
	}

	public void setIndicaActivo(String indicaActivo) {
		this.indicaActivo = indicaActivo;
	}

	
}
