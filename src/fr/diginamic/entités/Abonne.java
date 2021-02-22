package fr.diginamic.entités;

import java.util.Date;

public class Abonne {

	private Integer id;
	private String prenom;
	private String nom;
	private Date date_naissance;
	private String adresse;
	private String codePostale;
	private String ville;
	
	public Abonne(Integer id, String prenom, String nom, Date date, String adresse, String codePostale, String ville) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.date_naissance = date;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDate() {
		return date_naissance;
	}

	public void setDate(Date date) {
		this.date_naissance = date;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return id + " : " + prenom + " " + nom + ", né le " + date_naissance
				+ "\n" + adresse + ", " + codePostale + " " + ville;
	}
	
	
}
