package cl.banchile.ilv.fsw.facultad.to.ext;

import java.io.Serializable;

public class HeaderRequest implements Serializable {

	private static final long serialVersionUID = -1432164798273995980L;

	public HeaderRequest() {}

	private ConsumidorHeaderReq consumidor;
	
	private TransaccionHeaderReq transaccion;

	public ConsumidorHeaderReq getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(ConsumidorHeaderReq consumidor) {
		this.consumidor = consumidor;
	}

	public TransaccionHeaderReq getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(TransaccionHeaderReq transaccion) {
		this.transaccion = transaccion;
	}
}
