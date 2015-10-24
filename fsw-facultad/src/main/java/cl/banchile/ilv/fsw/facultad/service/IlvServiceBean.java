package cl.banchile.ilv.fsw.facultad.service;

import org.switchyard.component.bean.Service;

import cl.banchile.ilv.fsw.facultad.exception.IlvException;
import cl.banchile.ilv.fsw.facultad.to.output.BanchileFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BancoFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RepresentativeFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RuleRepresentativeFacultyOutSrv;

@Service(IlvService.class)
public class IlvServiceBean implements IlvService {

	@Override
	public BanchileFacultyOutSrv getFacultiesBanchile() throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BancoFacultyOutSrv getFacultiesBanco() throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuleRepresentativeFacultyOutSrv getRuleRepresentativeFaculty(
			String idAdpoderado) throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RepresentativeFacultyOutSrv getRepresentativeFaculty(String idEmpresa)
			throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validateFacultyRepresentative(String idApoderado,
			String idFacultad) throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

}
