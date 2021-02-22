/**
 * 
 */
package fr.diginamic.props;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.ResourceBundle;

import com.mysql.cj.jdbc.Driver;

import fr.diginamic.entités.Abonne;

/**
 * @author manon
 *
 */
public class TestConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			// Etape1 : charger le driver, qui est fournie par le librairie MariaDB
			DriverManager.registerDriver(new Driver());
		} catch (Exception e) {
			System.out.println("Impossible de charger le driver MariaDB");
		}
		
		// Etape 2 : Je demande au DriverManager de me fournir une connexion a une base de type MariaDB
		ResourceBundle props = ResourceBundle.getBundle("database");
		String url = props.getString("data.url");
		String login = props.getString("data.login");
		String password = props.getString("data.password");
		
		Connection connection = null;
		
		try {			
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Création du statement 
			Statement statement = connection.createStatement();
			
			// Etape 4 : création d'un select
			ResultSet curseur = statement.executeQuery("SELECT * FROM abonne");
			
			ArrayList<Abonne> abonne = new ArrayList<>();
			
			while (curseur.next()) {
				Integer id = curseur.getInt("id");
				String prenom = curseur.getString("prenom");
				String nom = curseur.getString("nom");
				Date dateNaissance = curseur.getDate("date_naissance");
				String adresse = curseur.getString("adresse");
				String codePostale = curseur.getString("code_postal");
				String ville = curseur.getString("ville");
						
				Abonne AboEncours = new Abonne(id, prenom, nom, dateNaissance, adresse, codePostale, ville);
				abonne.add(AboEncours);
			}
			
			
			System.out.println(abonne);
			
			curseur.close();
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Impossible de se connecter a la base de données" + e.getMessage());
		}
		
		

	}
}
