package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import cl.banchile.ilv.fsw.facultad.to.BancoFacultyTO;

@XmlRootElement(name="facultadBancoOutSrvBody",namespace="urn:cl.banchile.fsw:ilv-ws:1.0")
public class BancoFacultyOutSrvBody implements Serializable {

	private static final long serialVersionUID = -5543593310818469935L;
	private List<BancoFacultyTO> listaFacultadBco;
	
	public BancoFacultyOutSrvBody(){}
	
	@XmlElement
	public List<BancoFacultyTO> getListaFacultadBco() {
		return listaFacultadBco;
	}
	public void setListaFacultadBco(List<BancoFacultyTO> listaFacultadBco) {
		this.listaFacultadBco = listaFacultadBco;
	}
}
