package cl.banchile.fsw.ilv.ws.service;

import cl.banchile.fsw.ilv.ws.exception.UsuarioException;
import cl.banchile.fsw.ilv.ws.to.InputServicio;
import cl.banchile.fsw.ilv.ws.to.OutputServicio;
/**
 * Interfaz del servicio Switchyard.
 *
 */
public interface Servicio {
	public OutputServicio getUsuarios(InputServicio input) throws UsuarioException;
}
