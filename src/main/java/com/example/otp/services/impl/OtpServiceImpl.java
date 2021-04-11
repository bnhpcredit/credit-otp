package com.example.otp.services.impl;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Service;

import com.example.otp.services.facade.OtpService;

@Getter
@Data
@Service
public class OtpServiceImpl implements OtpService {

	@Override
	public String createOtp() {
		int randomPin   =(int) (Math.random()*9000)+1000;
        String otp  = String.valueOf(randomPin);
        return otp;
        
        }

	@Override
	public boolean validateOtp(int id) {
		return false;
	}
}
