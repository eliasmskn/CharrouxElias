package gestionparc.web;


import gestionparc.domain.Utilisateur;
import gestionparc.service.MongoInsert;

import java.util.List;

import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


public class Controleur {

	MongoInsert mongoinsert = new MongoInsert();
	@ResponseBody
	@RequestMapping(value = "/utilisateur", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public String insertionUtilisateur(@RequestBody Utilisateur utilisateur) {
		return mongoinsert.insertionUtilisateur(Utilisateur.getNom(), Utilisateur.getPrenom(), Utilisateur.getFonction(), Utilisateur.getService());
	}
	
}
