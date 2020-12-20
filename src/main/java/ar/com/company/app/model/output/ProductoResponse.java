package ar.com.company.app.model.output;

import java.time.LocalDate;

public class ProductoResponse extends Response {

	public ProductoResponse(String status, String code, LocalDate date) {
		super(status, code, date);
	}

}
