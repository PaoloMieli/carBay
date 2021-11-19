package com.example.carBay.utility;

import java.util.Base64;

public class ConverterBase64Utility {

	public static String convert(byte[] b) {
		
		return Base64.getEncoder().encodeToString(b);
	}
}
