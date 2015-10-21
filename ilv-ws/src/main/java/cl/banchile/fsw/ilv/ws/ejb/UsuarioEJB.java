package cl.banchile.fsw.ilv.ws.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

import cl.banchile.fsw.ilv.ws.dao.UsuarioDAO;
import cl.banchile.fsw.ilv.ws.to.InputServicio;
import cl.banchile.fsw.ilv.ws.to.UsuarioTO;


/**
 * Implementación del EJB.
 *
 */
@Stateless(name = "Usuario")
public class UsuarioEJB implements Usuario {
	
	/**
	 * Obtención de la referencia al Datasource.
	 */
	@Resource(lookup="java:/jdbc/clientes")
	private DataSource ds;
	
	/**
	 * Constructor de la clase.
	 */
	public UsuarioEJB(){}
	
	public List<UsuarioTO> getUsuarios(InputServicio input) throws SQLException{
		
		UsuarioDAO usuarioDao = new UsuarioDAO(ds);
		return usuarioDao.getUsuarios(input);
	}

}
