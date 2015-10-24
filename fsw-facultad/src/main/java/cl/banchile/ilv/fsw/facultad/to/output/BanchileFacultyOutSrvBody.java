package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import cl.banchile.ilv.fsw.facultad.to.BanchileFacultyTO;

@XmlRootElement(name="facultadBanchileOutSrvBody",namespace="urn:cl.banchile.fsw:ilv-ws:1.0")
public class BanchileFacultyOutSrvBody implements Serializable {

	private static final long serialVersionUID = -5155304012665399851L;
	
	public BanchileFacultyOutSrvBody(){}
	
	private List<BanchileFacultyTO> listaFacultadBch;

	@XmlElement
	public List<BanchileFacultyTO> getListaFacultadBch() {
		return listaFacultadBch;
	}

	public void setListaFacultadBch(List<BanchileFacultyTO> listaFacultadBch) {
		this.listaFacultadBch = listaFacultadBch;
	}
}
