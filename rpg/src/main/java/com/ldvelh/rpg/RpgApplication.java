package com.ldvelh.rpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class RpgApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgApplication.class, args);

		//On vérifie que tout se lance bien (Tomcat et autre)
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!DEMARRAGE APPLICATION!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");


		//On se connecte à la bdd
		String url = "jdbc:mysql://localhost:3306/bddrpg?serverTimezone=UTC";
		String user = "root"; String pwd = "";
		java.sql.Connection connexion = null;
		try {
			connexion = java.sql.DriverManager.getConnection(url, user, pwd);
			//L'object connexion va nous permettre d'effectuer des requêtes...
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!BASE DE DONNEES : Connection réussie!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


			//Un test pour vérifier la connexion à la bdd, on affiche les utilisateurs existants
			Statement statement = connexion.createStatement();
			String query = "SELECT util_id, util_nom FROM utilisateur";
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()){
                String nom = resultSet.getString("util_nom");
				String id = resultSet.getString(1);
                System.out.println("utilisateur ayant pour id : "+ id +" a pour nom : " + nom);
            }
			//////////fin zone de test


		} catch ( java.sql.SQLException e ) {
			//Problème de connexion à la base !
			System.out.println(e.getMessage());
		}

		//Lorsqu'on a fini de l'utiliser, on ferme la connexion à la bdd
		if(connexion != null) {
			try {
				connexion.close();
			}
			catch ( java.sql.SQLException e ) {
				//Problème de déconnexion, ce n'est pas très grave...
			}
		}

	}
}
