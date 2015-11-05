package cl.banchile.ilv.fsw.facultad.to.input;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ruleRepresentativeFacultyInSrv",namespace="urn:cl.banchile.ilv:fsw-facultad:1.0")
public class RuleRepresentativeFacultyInSrv implements Serializable {

	private static final long serialVersionUID = 8150423231496924709L;
	private String idApoderado;
	
	@XmlElement
	public String getIdApoderado() {
		return idApoderado;
	}
	public void setIdApoderado(String idApoderado) {
		this.idApoderado = idApoderado;
	}
}
