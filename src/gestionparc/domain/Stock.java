package gestionparc.domain;

import java.util.ArrayList;

public class Stock 
{
	private int qte;
	
	ArrayList<Ordinateur>ordinateurs = new ArrayList<Ordinateur>();
	
	ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
	
	ArrayList<Telephone> telephones = new ArrayList<Telephone>();
	
	
	public ArrayList<Serveur> getServeurs() {
		return serveurs;
	}

	public void setServeurs(ArrayList<Serveur> serveurs) {
		this.serveurs = serveurs;
	}

	public ArrayList<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(ArrayList<Telephone> telephones) {
		this.telephones = telephones;
	}


	public ArrayList<Ordinateur> getOrdinateurs() {
		return ordinateurs;
	}

	public void setOrdinateurs(ArrayList<Ordinateur> ordinateurs) {
		this.ordinateurs = ordinateurs;
	}
	
}
