package gestionparc;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import gestionparc.service.MongoInsert;

import java.util.Arrays;

public class Main 
{

   public static void main( String args[] ) 
   {
	   MongoInsert mongoObject = new MongoInsert();
	   
	   mongoObject.insertionUtilisateur("Younes", "Mskn", "Boss", "Direction");
	   
	   mongoObject.insertionTelephone("0652790471", "Apple", "Iphone6", "1234098738237617", 1);
	   
	   mongoObject.insertionOrdinateur("hp", "probook", "i7", "windows7SP1", "8Go", "SSD 256Go", 2);
	   
	   mongoObject.insertionServeur("Toshiba", "xeon", "windows2012SE", "28Go", "HDD 2To", 3);
	   
	   mongoObject.insertionStock("Ordinateur", "Dell", "Latitude3350", 35);
   }
}
