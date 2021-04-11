package com.example.otp.services.facade;

public interface OtpService {

        String createOtp();

		boolean validateOtp(int id);
}
