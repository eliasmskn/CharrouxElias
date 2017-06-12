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
public class MongoInsert2 {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	
	
	public String insertionUtilisateur(String nom, String prenom, String fonction, String service) 
	{		
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setFonction(fonction);
		utilisateur.setService(service);
		mongoOperation.save(utilisateur);

		return "Insertion utilisateur éffectuée avec succès !!";
	}
	
	
	public String insertionOrdinateur(String marque, String type, String proc, String os, String ram, String ddur) 
	{		
		Ordinateur ordinateur = new Ordinateur();
		ordinateur.setMarque(marque);
		ordinateur.setType(type);
		ordinateur.setProc(proc);
		ordinateur.setOs(os);
		ordinateur.setRam(ram);
		ordinateur.setDdur(ddur);
		mongoOperation.save(ordinateur);

		return "Insertion ordinateur éffectuée avec succès !!";
	}
	
	
	public String insertionServeur(String marque, String proc, String ram, String ddur, String os) 
	{		
		Serveur serveur = new Serveur();
		serveur.setMarque(marque);
		serveur.setProc(proc);
		serveur.setRam(ram);
		serveur.setDdur(ddur);
		serveur.setOs(os);
		mongoOperation.save(serveur);

		return "Insertion serveur éffectuée avec succès !!";
	}
	
	
	
	public String insertionTelephone(String num, String marque, String type, int imei) 
	{		
		Telephone telephone = new Telephone();
		telephone.setNum(num);
		telephone.setMarque(marque);;
		telephone.setType(type);
		telephone.setIMEI(imei);
		mongoOperation.save(telephone);

		return "Insertion téléphone éffectuée avec succès !!";
	}
	

}