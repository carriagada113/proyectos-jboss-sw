package cl.banchile.ilv.fsw.facultad.service;

import cl.banchile.ilv.fsw.facultad.exception.IlvException;
import cl.banchile.ilv.fsw.facultad.to.input.BanchileFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.BancoFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.FacultyRepresentativeInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.RepresentativeFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.RuleRepresentativeFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RepresentativeFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BanchileFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BancoFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RuleRepresentativeFacultyOutSrv;

public interface IlvService {
	
	public BanchileFacultyOutSrv getFacultiesBanchile( BanchileFacultyInSrv input ) throws IlvException;
	
	public BancoFacultyOutSrv getFacultiesBanco( BancoFacultyInSrv input ) throws IlvException;
	
	public RuleRepresentativeFacultyOutSrv getRuleRepresentativeFaculty( RuleRepresentativeFacultyInSrv input ) throws IlvException;
	
	public RepresentativeFacultyOutSrv getRepresentativeFaculty( RepresentativeFacultyInSrv input ) throws IlvException;
	
	public String validateFacultyRepresentative( FacultyRepresentativeInSrv input ) throws IlvException;
}
