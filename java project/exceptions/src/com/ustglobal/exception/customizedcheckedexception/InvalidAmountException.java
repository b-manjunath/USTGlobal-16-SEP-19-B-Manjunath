package com.ustglobal.exception.customizedcheckedexception;

public class InvalidAmountException extends Exception {
	private String msg = "daily limit 40,000 rupees only";


	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
