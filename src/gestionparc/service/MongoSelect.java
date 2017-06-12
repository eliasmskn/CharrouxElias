package gestionparc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import gestionparc.domain.*;
import gestionparc.SpringMongoConfig;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MongoSelect {
	
	List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	List<Ordinateur> ordinateurs = new ArrayList<Ordinateur>();
	List<Serveur> serveurs = new ArrayList<Serveur>();
	List<Telephone> telephones = new ArrayList<Telephone>();
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	
		
	public List<Utilisateur> listerUtilisateurs() 
	{
		DBCursor cursor = mongoOperation.getCollection("Utilisateurs").find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setNom((String) obj.get("nom"));
			utilisateur.setPrenom((String) obj.get("prenom"));
			utilisateur.setFonction((String) obj.get("fonction"));
			utilisateur.setService((String) obj.get("service"));
			utilisateurs.add(utilisateur);
		}
		return utilisateurs;
	}
	
	
	public List<Ordinateur> listerOrdinateurs() 
	{
		DBCursor cursor = mongoOperation.getCollection("Ordinateur").find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			
			Ordinateur ordinateur = new Ordinateur();
			ordinateur.setMarque((String) obj.get("marque"));
			ordinateur.setType((String) obj.get("type"));
			ordinateur.setProc((String) obj.get("Proc"));
			ordinateur.setOs((String) obj.get("Os"));
			ordinateur.setRam((String) obj.get("Ram"));
			ordinateur.setDdur((String) obj.get("ddur"));
			ordinateurs.add(ordinateur);
		}
		return ordinateurs;
	}
	
	
	
	
	public List<Serveur> listerServeurs() 
	{
		DBCursor cursor = mongoOperation.getCollection("Serveur").find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			
			Serveur serveur = new Serveur();
			serveur.setMarque((String) obj.get("marque"));
			serveur.setProc((String) obj.get("Proc"));
			serveur.setRam((String) obj.get("Ram"));
			serveur.setDdur((String) obj.get("ddur"));
			serveur.setOs((String) obj.get("Os"));
			serveurs.add(serveur);
		}
		return serveurs;
	}
	
	
	
	public List<Telephone> listerTelephones() 
	{
		DBCursor cursor = mongoOperation.getCollection("Telephone").find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			
			Telephone telephone = new Telephone();
			telephone.setNum((String) obj.get("num"));
			telephone.setMarque((String) obj.get("marque"));
			telephone.setType((String) obj.get("type"));
			telephone.setIMEI((int)obj.get("imei"));
			telephones.add(telephone);
		}
		return telephones;
	}



}