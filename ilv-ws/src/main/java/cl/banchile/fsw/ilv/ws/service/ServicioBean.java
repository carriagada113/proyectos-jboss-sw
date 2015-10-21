package cl.banchile.fsw.ilv.ws.service;

import java.sql.SQLException;

import javax.ejb.EJB;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Property;
import org.switchyard.component.bean.Service;

import cl.banchile.fsw.ilv.ws.ejb.Usuario;
import cl.banchile.fsw.ilv.ws.exception.UsuarioException;
import cl.banchile.fsw.ilv.ws.to.InputServicio;
import cl.banchile.fsw.ilv.ws.to.OutputServicio;
import cl.banchile.fsw.ilv.ws.to.ResponseBody;
import cl.banchile.fsw.ilv.ws.to.ResponseHeader;

/**
 * Clase implementadora del servicio Switchyard.
 *
 */
@Service(Servicio.class)
public class ServicioBean implements Servicio {
	/**
	 * Log de la clase.
	 */
	static Logger logger = Logger.getLogger(ServicioBean.class);
    /**
     * Propiedad que recibe el nombre de la compañía.
     */
    @Property(name = "company.name")
    private String companyName;
    /**
     * Propiedad que recibe la descripción del servicio.
     */
    @Property(name = "service.description")
    private String serviceDescription;
    /**
     * Referencia al EJB.
     */
    @EJB
    private Usuario srvUsuario;
	
	public OutputServicio getUsuarios(InputServicio input) throws UsuarioException {
        
		OutputServicio out = new OutputServicio();
		ResponseBody body = new ResponseBody();
		ResponseHeader header = new ResponseHeader();

		try {
			body.setUsuarios(srvUsuario.getUsuarios(input));
			out.setResponseBody(body);

			header.setCompany(companyName);
			header.setDescription(serviceDescription);
			out.setResponseHeader(header);
		} catch (SQLException e) {
			logger.error("Error al consultar los usuarios: " + e.getMessage());
			throw new UsuarioException(e);
		}
		
        return out;
	}
}
