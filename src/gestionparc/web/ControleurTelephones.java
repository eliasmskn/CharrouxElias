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
public class ControleurTelephones {

	MongoInsert2 mongoinsert = new MongoInsert2();
	@ResponseBody
	@RequestMapping(value = "/telephone", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public String insertionTelephone(@RequestBody Telephone telephone) 
	{
		return mongoinsert.insertionTelephone(telephone.getNum(), telephone.getMarque(), telephone.getType(), telephone.getIMEI());
	}
	
	MongoSelect mongoselect = new MongoSelect();
	@ResponseBody
	@RequestMapping(value = "/telephones", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Telephone> listerTelephones()
	{
		return mongoselect.listerTelephones();
		
	}
	
}
