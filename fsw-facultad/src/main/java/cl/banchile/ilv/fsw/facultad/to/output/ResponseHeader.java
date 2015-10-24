package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="responseHeader",namespace="urn:cl.banchile.fsw:ilv-ws:1.0")
public class ResponseHeader implements Serializable {
	
	/**
	 * Id Serializacion
	 */
	private static final long serialVersionUID = -6497576886768752724L;
	/**
	 * Nombre de la company.
	 */
	private String company;
	/**
	 * Descripcion del servicio.
	 */
	private String description;
	
	/**
	 * Codigo de Respuesta del Servicio
	 */
	private String responseCodeService;
	
	/**
	 * Descripcion de la respuesta del Servicio
	 */
	private String responseDescService;
	
	/**
	 * Constructor de la clase
	 */
	public ResponseHeader(){}
	
	/**
	 * Retorna el valor del atributo company.
	 * @return valor del atributo company.
	 */
	@XmlElement
	public String getCompany() {
		return company;
	}

	/**
	 * Asigna un nuevo valor para el atributo company. 
	 * @param company valor a asignar en el atributo company.
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * Retorna el valor del atributo description.
	 * @return valor del atributo description.
	 */
	@XmlElement
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement
	public String getResponseCodeService() {
		return responseCodeService;
	}
	public void setResponseCodeService(String responseCodeService) {
		this.responseCodeService = responseCodeService;
	}
	@XmlElement
	public String getResponseDescService() {
		return responseDescService;
	}
	public void setResponseDescService(String responseDescService) {
		this.responseDescService = responseDescService;
	}	
}
