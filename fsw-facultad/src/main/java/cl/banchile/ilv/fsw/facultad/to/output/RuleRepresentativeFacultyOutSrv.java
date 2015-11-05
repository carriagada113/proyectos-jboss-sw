package cl.banchile.ilv.fsw.facultad.to.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ruleRepresentativeFacultyOutSrv",namespace="urn:cl.banchile.ilv:fsw-facultad:1.0")
public class RuleRepresentativeFacultyOutSrv implements Serializable {
	
	private static final long serialVersionUID = -4509805230395884714L;

	public RuleRepresentativeFacultyOutSrv(){}

	private ResponseHeader responseHeader;

	private RuleRepresentativeFacultyOutSrvBody responseBody;

	@XmlElement
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	@XmlElement
	public RuleRepresentativeFacultyOutSrvBody getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(RuleRepresentativeFacultyOutSrvBody responseBody) {
		this.responseBody = responseBody;
	}
}
