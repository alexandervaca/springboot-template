package ar.com.company.app.model.output;

import java.time.LocalDate;

import ar.com.company.app.model.output.dto.UsuarioDto;

public class GetUsuarioResponse extends Response {

	private UsuarioDto usuario;

	public GetUsuarioResponse(String status, String code, LocalDate date, UsuarioDto usuario) {
		super(status, code, date);
		this.usuario = usuario;
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

}
