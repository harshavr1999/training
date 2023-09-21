package training.iqgateway;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class RetrievingAllDocumentsFromMongoDB {

	public static void main(String[] args) {
		
		// Creating a Mongo Client
		MongoClient mongo = new MongoClient("localhost",27017);
		
		// Creating Credentials
		MongoCredential credential = MongoCredential.createCredential("TMS-1", "IQGatewayDB", "TMS-1".toCharArray());
		
		System.out.println("Connected to MongoDB Database Successfully...");
		
		// Accessing the Database
		MongoDatabase database = mongo.getDatabase("IQGatewayDB");
		System.out.println("Credentials "+credential);
		
		// Creating a Collection on DB from JAVA
//		database.createCollection("SampleCollection");
//		System.out.println("Collection Created Successfully...");
		
		// Retrieving the Collection
		MongoCollection<Document> collection = database.getCollection("Departments");
		System.out.println("Department Collection Selected Successsfully");
		
		// Getting the Iterable Object
		FindIterable<Document> iterDoc = collection.find();
		
		int i=1;
		Iterator it = iterDoc.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			i++;
		}
		
	}
	
}
