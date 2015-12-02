package br.com.rcaneppele.blog.infra;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

@Named
@ApplicationScoped
public class DataStoreProducer {
	
	private final Morphia morphia = new Morphia();
	
	@PostConstruct
	private void postConstruct() {
		morphia.mapPackage("br.com.rcaneppele.blog.model");
	}

	@Produces
	@RequestScoped
	private Datastore create() {
		Datastore ds = morphia.createDatastore(new MongoClient(), "blog");
		ds.ensureIndexes();
		
		return ds;
	}
	
}
