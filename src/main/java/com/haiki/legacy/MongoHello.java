package com.haiki.legacy;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoHello {

	public static void main(String[] args) {

		// To directly connect to a single MongoDB server (note that this will
		// not auto-discover the primary even
		// if it's a member of a replica set:
		// MongoClient mongoClient = new MongoClient();
		// or
		// MongoClient mongoClient = new MongoClient("localhost");
		// or
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient(new MongoClientURI(System.getenv().get("MONGOLABS_URI")));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// or, to connect to a replica set, with auto-discovery of the primary,
		// supply a seed list of members
		// MongoClient mongoClient = new MongoClient(Arrays.asList(
		// new ServerAddress("localhost", 27017), new ServerAddress(
		// "localhost", 27018), new ServerAddress("localhost",
		// 27019)));

		DB db = mongoClient.getDB("heroku_c6nscxb5");
		DBCollection coll = db.getCollection("testCollection");
		BasicDBObject doc = new BasicDBObject("name", "MongoDB")
				.append("type", "database").append("count", 1)
				.append("info", new BasicDBObject("x", 203).append("y", 102));
		coll.insert(doc);
		DBObject myDoc = coll.findOne();
		System.out.println(myDoc);

	}
}