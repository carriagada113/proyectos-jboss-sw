package cl.banchile.ilv.fsw.facultad.to.output;

import java.util.List;

import cl.banchile.ilv.fsw.facultad.to.ApoderadoFacultadTO;

public class ApoderadoFacultadOutSrvBody {

	public ApoderadoFacultadOutSrvBody() {}
	
	private List<ApoderadoFacultadTO> listaFacultadApoderado;

	public List<ApoderadoFacultadTO> getListaFacultadApoderado() {
		return listaFacultadApoderado;
	}

	public void setListaFacultadApoderado(
			List<ApoderadoFacultadTO> listaFacultadApoderado) {
		this.listaFacultadApoderado = listaFacultadApoderado;
	}
}
