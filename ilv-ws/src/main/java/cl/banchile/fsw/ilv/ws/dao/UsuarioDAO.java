package cl.banchile.fsw.ilv.ws.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import oracle.jdbc.OracleTypes;
import cl.banchile.fsw.ilv.ws.to.InputServicio;
import cl.banchile.fsw.ilv.ws.to.UsuarioTO;
import cl.banchile.fsw.ilv.ws.util.JDBCUtil;

/**
 * Clase de acceso al origen de datos.
 *
 */
public class UsuarioDAO {
	/**
	 * Log de la clase.
	 */
	static Logger logger = Logger.getLogger(UsuarioDAO.class);
	/**
	 * Referencia al Datasource.
	 */
	private DataSource ds;
	
	/**
	 * Constructor de la clase.
	 * @param ds Referencia al datasource.
	 */
	public UsuarioDAO(DataSource ds){
		this.ds = ds;
	}
	
	public List<UsuarioTO> getUsuarios(InputServicio input) throws SQLException{
		List<UsuarioTO> usuarios = new ArrayList<UsuarioTO>();
		Connection dbConnection = null;
		CallableStatement callableStatement = null;
		
		try {
			
			String query = "{call TINET_TEST_SP_CNS_USUARIOS(?,?)}";

			dbConnection = ds.getConnection();
			callableStatement = dbConnection.prepareCall(query);
			callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
			callableStatement.setString(2, input.getRut());
			
			callableStatement.execute();
			
			ResultSet cursor = (ResultSet) callableStatement.getObject(1);
			
			while (cursor.next ())
		    {
				UsuarioTO usuarioTo = new UsuarioTO();
				usuarioTo.setId(cursor.getInt(1));
				usuarioTo.setRut(cursor.getString(2));
				usuarioTo.setUsername(cursor.getString(3));
				usuarioTo.setNombre(cursor.getString(4));
				usuarioTo.setApaterno(cursor.getString(5));
				usuarioTo.setAmaterno(cursor.getString(6));
				usuarios.add(usuarioTo);
		    } 

		} catch (SQLException e) {
			logger.error("Error al realizar la consulta: " + e.getMessage());
			throw e;
		}finally {
			JDBCUtil.close(callableStatement);
			JDBCUtil.close(dbConnection);
		}
		return usuarios;

	}
}
