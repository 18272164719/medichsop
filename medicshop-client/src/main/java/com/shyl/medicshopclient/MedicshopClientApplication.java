package com.shyl.medicshopclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shyl.medicshopclient.dao")
public class MedicshopClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicshopClientApplication.class, args);
	}

}
