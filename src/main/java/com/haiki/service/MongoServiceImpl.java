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
import com.mongodb.MongoException;

@Service("mongoService")
public class MongoServiceImpl implements MongoService {

	DBCollection coll;

	public MongoServiceImpl() {
		MongoClient mongoClient = null;
		String mongoUri = System.getenv().get("MONGOLAB_URI");
		try {
			mongoClient = new MongoClient(new MongoClientURI(mongoUri));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		DB db = mongoClient.getDB("heroku_c6nscxb5");
		coll = db.getCollection("testCollection");
	}

	public void save(Hike hike) {
		DBObject doc = createDBObjectFromHike(hike);
		coll.insert(doc);
	}

	public List<Hike> getAllHikes() {
		List<Hike> allHikes = new ArrayList<Hike>();
		for (DBObject currentDoc : coll.find()) {
			if (currentDoc.get("title") != null
					&& currentDoc.get("description") != null) {
				allHikes.add(new Hike(currentDoc.get("title").toString(),
						currentDoc.get("description").toString()));
			}
		}
		return allHikes;
	}

	public boolean remove(Hike hike) {
		return removeByTitle(hike.getTitle());
	}

	private boolean removeByTitle(String title) {
		DBObject query = new BasicDBObject("title", title);
		try {
			coll.findAndRemove(query);
		} catch (MongoException e) {
			return false;
		}
		return true;
	}
	
	private static DBObject createDBObjectFromHike(Hike hike) {
		return new BasicDBObject("title", hike.getTitle()).append(
				"description", hike.getDescription());
	}

}