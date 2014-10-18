/**
 * 
 */
package com.dbhakuni.learning.bean;

/**
 * @author root
 *
 */
public class StudentVO {

	/**
	 * 
	 */
	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public StudentVO(String name, String std, int age) {
		super();
		this.name = name;
		this.std = std;
		this.age = age;
	}



	private String name;
	private String std;
	private int age;
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
