/**
 * 
 */
package com.dbhakuni.learning.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;

/**
 * @author digvijayb
 *
 */
@Configuration
public class MongoDbConfig {

	private static final String HOST = "linus.mongohq.com";
	private static final String USER = "newuser";
	private static final String PASSWORD = "test";
	private static final String DATABASE = "devdb";
	private static final int PORT = 10086;
	//mongodb://<user>:<password>@linus.mongohq.com:10086/devdb
	
	/**
	 * 
	 */
	public MongoDbConfig() {
		System.out.println("MongoDbConfig()");
	}
	
	
	public @Bean MongoDbFactory mongoDbFactory() throws MongoException, UnknownHostException {
		UserCredentials userCredentials = new UserCredentials(USER, PASSWORD);
		//return new SimpleMongoDbFactory(new MongoURI("mongodb://<user>:<pass>@<url>"));
		return new SimpleMongoDbFactory(new MongoClient(HOST,PORT), DATABASE, userCredentials);
	}
	
	
	public @Bean MongoOperations mongoOperations() throws MongoException, UnknownHostException {
		return new MongoTemplate(mongoDbFactory());
	}
	
}
