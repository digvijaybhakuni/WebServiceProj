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

	private static final String HOST = "yourhost";
	private static final String USER = "youruser";
	private static final String PASSWORD = "yourpassword";
	private static final String DATABASE = "yourdatabase";
	private static final int PORT = 10086;
	//
	
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
