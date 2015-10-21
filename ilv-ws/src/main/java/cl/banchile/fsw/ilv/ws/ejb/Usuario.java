package cl.banchile.fsw.ilv.ws.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

import cl.banchile.fsw.ilv.ws.to.InputServicio;
import cl.banchile.fsw.ilv.ws.to.UsuarioTO;


/**
 * Interfaz del EJB.
 *
 */
@Remote
public interface Usuario {
	public List<UsuarioTO> getUsuarios(InputServicio input) throws SQLException;
}
