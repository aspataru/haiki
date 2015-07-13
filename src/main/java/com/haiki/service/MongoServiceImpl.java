package com.haiki.service;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haiki.model.Hike;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Service("mongoService")
// TODO: integration test for mongo operations
public class MongoServiceImpl implements MongoService {

	DBCollection coll;

	public MongoServiceImpl() {
		MongoClient mongoClient = null;
		String mongoUri = System.getenv()
				 .get("MONGOLAB_URI");
		try {
			 mongoClient = new MongoClient(new MongoClientURI(mongoUri));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		DB db = mongoClient.getDB("heroku_c6nscxb5");
		coll = db.getCollection("testCollection");
	}

	public void save(Hike hike) {
		BasicDBObject doc = new BasicDBObject("name", hike.getName()).append(
				"description", hike.getDescription());
		coll.insert(doc);
	}

	public List<Hike> getAllHikes() {
		List<Hike> allHikes = new ArrayList<Hike>();
		for (DBObject currentDoc : coll.find()) {
			if (currentDoc.get("name") != null
					&& currentDoc.get("description") != null) {
				allHikes.add(new Hike(currentDoc.get("name").toString(),
						currentDoc.get("description").toString()));
			}
		}
		return allHikes;
	}

}