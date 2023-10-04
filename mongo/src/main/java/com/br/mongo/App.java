package com.br.mongo;

import model.Pessoa;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import  java.util.function.Consumer;

import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class App {
    public static void main( String[] args ) {
        
    	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
    			fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    	
    	MongoClient mongoClient = new MongoClient("localhost:27017",
    			MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
    	
    	MongoDatabase database = mongoClient.getDatabase("atividade")
    			.withCodecRegistry(pojoCodecRegistry);
    	
    	MongoCollection<Pessoa> collection = database.getCollection("Pessoa", Pessoa.class);
    	
    	collection.insertOne(new Pessoa(1021, "Rafael", 24, "Catolé", 283497, 2997, "Lingua Brasileira de Sinais (Libras)"));
    	
    	collection.insertOne(new Pessoa(2056, "Sofia", 20, "Alto Branco", 283497, 2997, "Lingua Brasileira de Sinais (Libras)"));
    	
    	collection.insertOne(new Pessoa(1150, "Mateus", 25, "Liberdade", 283497, 2997, "Lingua Brasileira de Sinais (Libras)"));
    	
    	collection.insertOne(new Pessoa(1456, "Samira", 22, "Mirante", 283497, 2997, "Lingua Brasileira de Sinais (Libras)"));
    	
    	collection.insertOne(new Pessoa(1026, "Arthur", 21, "Alto Branco", 283497, 2997, "Lingua Brasileira de Sinais (Libras)"));
    }
}
