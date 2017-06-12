package gestionparc.domain;

public class Utilisateur 
{
	private String nom, prenom, fonction, service;
	private int id_U;
	
	public Utilisateur()
	{
		id_U = 0;
		nom = "";
		prenom = "";
		fonction = "";
		service = "";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getId_U() {
		return id_U;
	}

	public void setId_U(int id_U) {
		this.id_U = id_U;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", fonction="
				+ fonction + ", service=" + service + ", id_U=" + id_U + "]";
	}
	
	
}
