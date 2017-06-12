package gestionparc.web;


import gestionparc.domain.*;
import gestionparc.service.*;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ControleurUtilisateurs {

	MongoInsert2 mongoinsert = new MongoInsert2();
	@ResponseBody
	@RequestMapping(value = "/utilisateur", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public String insertionUtilisateur(@RequestBody Utilisateur utilisateur) 
	{
		return mongoinsert.insertionUtilisateur(utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getFonction(), utilisateur.getService());
	}
	
	MongoSelect mongoselect = new MongoSelect();
	@ResponseBody
	@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Utilisateur> listerUtilisateurs()
	{
		return mongoselect.listerUtilisateurs();
		
	}
	
}
