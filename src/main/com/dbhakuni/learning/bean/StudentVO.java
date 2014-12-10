/**
 * 
 */
package com.dbhakuni.learning.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author root
 *
 */@Document(collection="student")
public class StudentVO {

	/**
	 * 
	 */
	public StudentVO() {
	}

	
	
	public StudentVO(String name, String std, int age) {
		super();
		this.name = name;
		this.std = std;
		this.age = age;
	}

	public StudentVO(String id, String name, String std, int age) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.age = age;
	}



	private @Id String id;		
	private String name;
	private String std;
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
