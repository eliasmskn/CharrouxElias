package gestionparc.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoUpdate 
{
	
    public void updateUtilisateur(String nom, String prenom, String fonction, String service)
	{
    	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        DB db = mongoClient.getDB("GestionParc");
	    
		try
		{		
			DBCollection coll = db.getCollection("Utilisateurs");
				
	         DBCursor cursor = coll.find();
				
	         while (cursor.hasNext()) { 
	            DBObject updateDocument = cursor.next();
	            updateDocument.put("likes","200");
	            coll.update(updateDocument, updateDocument); 
	         }
				
	         System.out.println("Document updated successfully");
	         cursor = coll.find();
				
	         int i = 1;
				
	         while (cursor.hasNext()) { 
	            System.out.println("Updated Document: "+i); 
	            System.out.println(cursor.next()); 
	            i++;
	         }
	    }
	    catch(Exception e)
		{
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }	
	}
}