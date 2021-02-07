package com.ldvelh.rpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class RpgApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(RpgApplication.class, args);

		//On vérifie que tout se lance bien (Tomcat et autre)
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!DEMARRAGE APPLICATION!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}
}
