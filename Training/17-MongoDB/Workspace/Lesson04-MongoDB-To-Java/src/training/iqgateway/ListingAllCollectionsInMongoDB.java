package training.iqgateway;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
public class ListingAllCollectionsInMongoDB {

	public static void main(String[] args) {
		
		// Creating a Mongo Client
		MongoClient mongo = new MongoClient("localhost",27017);
		
		// Creating Credentials
		MongoCredential credential = MongoCredential.createCredential("TMS-1", "IQGatewayDB", "TMS-1".toCharArray());
		
		System.out.println("Connected to MongoDB Database Successfully...");
		
		// Accessing the Database
		MongoDatabase database = mongo.getDatabase("IQGatewayDB");
		
		for(String name: database.listCollectionNames()){
			System.out.println(name);
		}
		
	}
	
}
