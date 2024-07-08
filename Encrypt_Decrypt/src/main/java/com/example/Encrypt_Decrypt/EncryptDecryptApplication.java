package com.example.Encrypt_Decrypt;

import com.example.Encrypt_Decrypt.example.Encrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EncryptDecryptApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(EncryptDecryptApplication.class, args);

		Encrypt encrypt = new Encrypt();
		String text = "{\"highdate\":\"2024-07-03\",\"registeredemployee\":18,\"savestatus\":0}";
		String encrypted = encrypt.getAES(text);
		System.out.println(encrypted);
		System.out.println(encrypt.getAesDecrypt(encrypted));


	}

}
