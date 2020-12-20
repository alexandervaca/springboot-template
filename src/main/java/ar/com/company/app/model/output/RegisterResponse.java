package ar.com.company.app.model.output;

import java.time.LocalDate;

public class RegisterResponse extends Response {

	public RegisterResponse(String status, String code, LocalDate date) {
		super(status, code, date);
	}

}
