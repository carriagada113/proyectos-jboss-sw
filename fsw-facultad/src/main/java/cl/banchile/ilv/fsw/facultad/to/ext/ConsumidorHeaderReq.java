package cl.banchile.ilv.fsw.facultad.to.ext;

import java.io.Serializable;

public class ConsumidorHeaderReq implements Serializable {

	private static final long serialVersionUID = 1693693775712641779L;

	public ConsumidorHeaderReq() {}
	
    private String idApp;
    private String usuario;

	public String getIdApp() {
		return idApp;
	}
	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
