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
public class ControleurServeurs {

	MongoInsert2 mongoinsert = new MongoInsert2();
	@ResponseBody
	@RequestMapping(value = "/serveur", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public String insertionServeur(@RequestBody Serveur serveur) 
	{
		return mongoinsert.insertionServeur(serveur.getMarque(), serveur.getProc(), serveur.getRam(), serveur.getDdur(), serveur.getOs());
	}
	
	MongoSelect mongoselect = new MongoSelect();
	@ResponseBody
	@RequestMapping(value = "/serveurs", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Serveur> listerServeurs()
	{
		return mongoselect.listerServeurs();
		
	}
	
}
