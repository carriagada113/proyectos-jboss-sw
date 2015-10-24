package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;

public class RuleRepresentativeFacultyOutSrv implements Serializable {
	
	private static final long serialVersionUID = -4509805230395884714L;

	public RuleRepresentativeFacultyOutSrv(){}

	private ResponseHeader responseHeader;

	private RuleRepresentativeFacultyOutSrvBody responseBody;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public RuleRepresentativeFacultyOutSrvBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(RuleRepresentativeFacultyOutSrvBody responseBody) {
		this.responseBody = responseBody;
	}
}
