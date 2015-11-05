package cl.banchile.ilv.fsw.facultad.to.ext;

import java.io.Serializable;

public class TransaccionHeaderReq implements Serializable {

	private static final long serialVersionUID = -6528797400790005100L;

	public TransaccionHeaderReq() {}
	
    private String internalCode;
    private String idTransaccionNegocio;
    private String fechaHora;
    private String canal;
    private String sucursal;

	public String getInternalCode() {
		return internalCode;
	}
	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
	public String getIdTransaccionNegocio() {
		return idTransaccionNegocio;
	}
	public void setIdTransaccionNegocio(String idTransaccionNegocio) {
		this.idTransaccionNegocio = idTransaccionNegocio;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
}
