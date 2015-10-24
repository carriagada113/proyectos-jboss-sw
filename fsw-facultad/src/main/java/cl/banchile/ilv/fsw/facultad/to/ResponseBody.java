package cl.banchile.ilv.fsw.facultad.to;

import java.io.Serializable;
import java.util.List;

/**
 * Clase de transporte de los datos del body de la salida del servicio.
 *
 */
public class ResponseBody implements Serializable {
	
	/**
	 * Id de serialización.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Listado de conceptos.
	 */
	private List<UsuarioTO> usuarios;
	
	/**
	 * Constructor de la clase.
	 */
	public ResponseBody(){}

	/**
	 * Retorna el valor del atributo usuarios.
	 * @return valor del atributo usuarios.
	 */
	public List<UsuarioTO> getUsuarios() {
		return usuarios;
	}

	/**
	 * Asigna un nuevo valor para el atributo usuarios. 
	 * @param usuarios valor a asignar en el atributo usuarios.
	 */
	public void setUsuarios(List<UsuarioTO> usuarios) {
		this.usuarios = usuarios;
	}
	
}
