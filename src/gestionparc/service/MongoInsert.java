package gestionparc.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class MongoInsert
{
	public String insertionUtilisateur(String nom, String prenom, String fonction, String service)
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	    DB db = mongoClient.getDB("GestionParc");
	    
		try{		
	         DBCollection coll = db.getCollection("Utilisateurs"); 
	         BasicDBObject doc = new BasicDBObject("Nom", nom).
	            append("Prenom", prenom).
	            append("fonction", fonction).
	            append("Service", service);
					
	         coll.insert(doc);
	      }
		   catch(Exception e)
		   {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	       }	
		
		return "L'utilisateur à été créer";
	}
	
	public void insertionTelephone(String num,String marque, String type, String Imei, int id_mat)
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	    DB db = mongoClient.getDB("GestionParc");
	    
		try{		
	         DBCollection coll = db.getCollection("Telephone"); 
	         BasicDBObject doc = new BasicDBObject("Num", num).
	            append("Marque", marque).
	            append("Type", type).
	            append("Imei", Imei).
	            append("Id_Mat", id_mat);
					
	         coll.insert(doc);
	      }
		   catch(Exception e)
		   {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	       }	
	}
	
	public  void insertionOrdinateur(String marque, String type, String processeur, String os, String ram, String ddur, int id_mat)
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	    DB db = mongoClient.getDB("GestionParc");
	    
		try{		
	         DBCollection coll = db.getCollection("Ordinateur"); 
	         BasicDBObject doc = new BasicDBObject("Marque", marque).
	            append("Type", type).
	            append("Processeur", processeur).
	            append("Os", os).
	            append("Ram", ram).
	            append("Ddur", ddur).
	            append("Id_Mat", id_mat);
					
	         coll.insert(doc);
	      }
		   catch(Exception e)
		   {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	       }	
	}
	
	
	public  void insertionServeur(String marque, String processeur, String os, String ram, String ddur, int id_mat)
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	    DB db = mongoClient.getDB("GestionParc");
	    
		try{		
	         DBCollection coll = db.getCollection("Serveur"); 
	         BasicDBObject doc = new BasicDBObject("Marque", marque).
	            append("Processeur", processeur).
	            append("Os", os).
	            append("Ram", ram).
	            append("Ddur", ddur).
	            append("Id_Mat", id_mat);
					
	         coll.insert(doc);
	      }
		   catch(Exception e)
		   {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	       }
	}
	
	
	public  void insertionStock(String nom, String marque, String type, int qte)
	{
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	    DB db = mongoClient.getDB("GestionParc");
	    
		try{		
	         DBCollection coll = db.getCollection("Stock"); 
	         BasicDBObject doc = new BasicDBObject("Marque", marque).
	            append("Nom", nom).
	            append("Marque", marque).
	            append("Type", type).
	            append("Qte", qte);
					
	         coll.insert(doc);
	      }
		   catch(Exception e)
		   {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	       }	
	}
}

