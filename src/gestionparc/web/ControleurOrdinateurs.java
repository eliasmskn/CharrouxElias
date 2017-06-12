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
public class ControleurOrdinateurs {

	MongoInsert2 mongoinsert = new MongoInsert2();
	@ResponseBody
	@RequestMapping(value = "/ordinateur", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public String insertionOrdinateur(@RequestBody Ordinateur ordinateur) 
	{
		return mongoinsert.insertionOrdinateur(ordinateur.getMarque(), ordinateur.getType(), ordinateur.getProc(), ordinateur.getOs(), ordinateur.getRam(), ordinateur.getDdur());
	}
	
	MongoSelect mongoselect = new MongoSelect();
	@ResponseBody
	@RequestMapping(value = "/ordinateurs", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Ordinateur> listerOrdinateurs()
	{
		return mongoselect.listerOrdinateurs();
		
	}
	
}
