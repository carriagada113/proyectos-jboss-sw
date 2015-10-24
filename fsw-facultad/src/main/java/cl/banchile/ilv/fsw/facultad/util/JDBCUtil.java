package cl.banchile.ilv.fsw.facultad.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * Clase responsable de manejar conexiones JDBC.
 * 
 */
public final class JDBCUtil {
	/**
	 * Log de la clase.
	 */
	static Logger logger = Logger.getLogger(JDBCUtil.class);
    /**
     * Constructor de la clase.
     */
    private JDBCUtil() {
        super();
    }

    /**
     * Cierra la conexion a BD.
     *
     * @param con Conexion a BD.
     */
    public static void close(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
        	logger.error("Error al cerrar conexion: " + e.getMessage());
        }
    }
    
    /**
     * Cierra un ResultSet.
     *
     * @param rs ResultSet a cerrar.
     */
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch(SQLException e) {
            logger.error("Error al cerrar Rs: " + e.getMessage());
        }
    }
    
    /**
     * Cierra un Prepared Statement.
     *
     * @param ps PreparedStatement a cerrar.
     */
    public static void close(PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch(SQLException e) {
            logger.error("Error al cerrar Ps: " + e.getMessage());
        }
    }
    
    /**
     * Cierra un Callable Statement.
     *
     * @param cs CallableStatement a cerrar.
     */
    public static void close(CallableStatement cs) {
        try {
            if (cs != null) {
                cs.close();
            }
        } catch(SQLException e) {
            logger.error("Error al cerrar Cs: " + e.getMessage());
        }
    }
}
