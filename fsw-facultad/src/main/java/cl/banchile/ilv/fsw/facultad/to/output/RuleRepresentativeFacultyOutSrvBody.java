package cl.banchile.ilv.fsw.facultad.to.output;

import java.util.List;

import cl.banchile.ilv.fsw.facultad.to.RuleRepresentativeFacultyTO;

public class RuleRepresentativeFacultyOutSrvBody {
	
	public RuleRepresentativeFacultyOutSrvBody(){}
	
	private List<RuleRepresentativeFacultyTO> listaReglasRepresFacultad;

	public List<RuleRepresentativeFacultyTO> getListaReglasRepresFacultad() {
		return listaReglasRepresFacultad;
	}

	public void setListaReglasRepresFacultad(
			List<RuleRepresentativeFacultyTO> listaReglasRepresFacultad) {
		this.listaReglasRepresFacultad = listaReglasRepresFacultad;
	}
}
