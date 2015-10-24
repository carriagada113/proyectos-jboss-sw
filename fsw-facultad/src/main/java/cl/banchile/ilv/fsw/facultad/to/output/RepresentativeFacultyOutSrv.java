package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;

public class RepresentativeFacultyOutSrv implements Serializable {

	private static final long serialVersionUID = 1L;

	public RepresentativeFacultyOutSrv() {}
	
	private ResponseHeader responseHeader;
	
	private ApoderadoFacultadOutSrvBody responseBody;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public ApoderadoFacultadOutSrvBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(ApoderadoFacultadOutSrvBody responseBody) {
		this.responseBody = responseBody;
	}
}
