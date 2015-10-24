package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="facultadBancoOutSrv",namespace="urn:cl.banchile.fsw:ilv-ws:1.0")
public class BancoFacultyOutSrv implements Serializable {

	private static final long serialVersionUID = 3097373202585089391L;

	private ResponseHeader responseHeader;
	
	private BancoFacultyOutSrvBody responseBody;
	
	public BancoFacultyOutSrv(){}

	@XmlElement
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	@XmlElement
	public BancoFacultyOutSrvBody getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(BancoFacultyOutSrvBody responseBody) {
		this.responseBody = responseBody;
	}
}
