package cl.banchile.ilv.fsw.facultad.to.input;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="representativeFacultyInSrv",namespace="urn:cl.banchile.ilv:fsw-facultad:1.0")
public class RepresentativeFacultyInSrv implements Serializable{

	private static final long serialVersionUID = 1134517895949461161L;
	private String idEmpresa;
	@XmlElement
	public String getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
}
