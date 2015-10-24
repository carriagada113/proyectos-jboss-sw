package cl.banchile.ilv.fsw.facultad.service;

import cl.banchile.ilv.fsw.facultad.exception.IlvException;
import cl.banchile.ilv.fsw.facultad.to.output.RepresentativeFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BanchileFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BancoFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RuleRepresentativeFacultyOutSrv;

public interface IlvService {
	
	public BanchileFacultyOutSrv getFacultiesBanchile() throws IlvException;
	
	public BancoFacultyOutSrv getFacultiesBanco() throws IlvException;
	
	public RuleRepresentativeFacultyOutSrv getRuleRepresentativeFaculty( String idAdpoderado ) throws IlvException;
	
	public RepresentativeFacultyOutSrv getRepresentativeFaculty( String idEmpresa ) throws IlvException;
	
	public String validateFacultyRepresentative( String idApoderado, String idFacultad ) throws IlvException;
}
