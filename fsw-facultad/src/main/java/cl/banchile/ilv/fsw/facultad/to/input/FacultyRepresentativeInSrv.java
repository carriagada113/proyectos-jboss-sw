package cl.banchile.ilv.fsw.facultad.to.input;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="facultyRepresentativeInSrv",namespace="urn:cl.banchile.ilv:fsw-facultad:1.0")
public class FacultyRepresentativeInSrv implements Serializable  {

	private static final long serialVersionUID = 2762580611401589742L;
	private String idApoderado;
	private String idFacultad;
	
	@XmlElement	
	public String getIdApoderado() {
		return idApoderado;
	}
	public void setIdApoderado(String idApoderado) {
		this.idApoderado = idApoderado;
	}
	@XmlElement
	public String getIdFacultad() {
		return idFacultad;
	}
	public void setIdFacultad(String idFacultad) {
		this.idFacultad = idFacultad;
	}
}