package cl.banchile.ilv.fsw.facultad.to.ext;

import java.io.Serializable;


public class ApoderadoFacultadGiroRequest implements Serializable {

	private static final long serialVersionUID = -3013964331057105340L;

	public ApoderadoFacultadGiroRequest() {}
	
	private HeaderRequest header;
	
	private ApoderadoFacultadGiroBody body;

	public HeaderRequest getHeader() {
		return header;
	}

	public void setHeader(HeaderRequest header) {
		this.header = header;
	}

	public ApoderadoFacultadGiroBody getBody() {
		return body;
	}

	public void setBody(ApoderadoFacultadGiroBody body) {
		this.body = body;
	}
}
