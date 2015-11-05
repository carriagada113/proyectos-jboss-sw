package cl.banchile.ilv.fsw.facultad.service;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import cl.banchile.ilv.fsw.facultad.exception.IlvException;
import cl.banchile.ilv.fsw.facultad.service.ext.CS000203_ApoderadoFacultadGiro;
import cl.banchile.ilv.fsw.facultad.to.ext.ApoderadoFacultadGiroBody;
import cl.banchile.ilv.fsw.facultad.to.ext.ApoderadoFacultadGiroRequest;
import cl.banchile.ilv.fsw.facultad.to.ext.HeaderRequest;
import cl.banchile.ilv.fsw.facultad.to.input.BanchileFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.BancoFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.FacultyRepresentativeInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.RepresentativeFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.input.RuleRepresentativeFacultyInSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BanchileFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.BancoFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RepresentativeFacultyOutSrv;
import cl.banchile.ilv.fsw.facultad.to.output.RuleRepresentativeFacultyOutSrv;

@Service(IlvService.class)
public class IlvServiceBean implements IlvService {

	@Inject
	@Reference
	private CS000203_ApoderadoFacultadGiro rfgService;
	
	@Override
	public BanchileFacultyOutSrv getFacultiesBanchile(BanchileFacultyInSrv input)
			throws IlvException {
		
		ApoderadoFacultadGiroRequest req = new ApoderadoFacultadGiroRequest();
		HeaderRequest header = new HeaderRequest();
		ApoderadoFacultadGiroBody body = new ApoderadoFacultadGiroBody();
		
		req.setBody( body );
		req.setHeader( header );
	
		rfgService.obtenerApoderadoFacultadGiro( req );
		
		return null;
	}

	@Override
	public BancoFacultyOutSrv getFacultiesBanco(BancoFacultyInSrv input)
			throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuleRepresentativeFacultyOutSrv getRuleRepresentativeFaculty( RuleRepresentativeFacultyInSrv input ) 
	throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RepresentativeFacultyOutSrv getRepresentativeFaculty( RepresentativeFacultyInSrv input )
	throws IlvException {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validateFacultyRepresentative( FacultyRepresentativeInSrv input ) throws IlvException {
		// TODO Auto-generated method stub
		return null;
	}
}
