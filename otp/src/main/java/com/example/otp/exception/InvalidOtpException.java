package com.example.otp.exception;

public class InvalidOtpException extends Exception {

	private static final long serialVersionUID = 5389979505000487353L;

	public InvalidOtpException(String msg)
    {
        super(msg);
    }
}

