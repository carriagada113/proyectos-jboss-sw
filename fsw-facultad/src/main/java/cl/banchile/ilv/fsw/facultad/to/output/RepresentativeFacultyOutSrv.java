package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="representativeFacultyOutSrv",namespace="urn:cl.banchile.ilv:fsw-facultad:1.0")
public class RepresentativeFacultyOutSrv implements Serializable {

	private static final long serialVersionUID = 1L;

	public RepresentativeFacultyOutSrv() {}
	
	private ResponseHeader responseHeader;
	
	private ApoderadoFacultadOutSrvBody responseBody;

	@XmlElement
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	@XmlElement
	public ApoderadoFacultadOutSrvBody getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(ApoderadoFacultadOutSrvBody responseBody) {
		this.responseBody = responseBody;
	}
}
