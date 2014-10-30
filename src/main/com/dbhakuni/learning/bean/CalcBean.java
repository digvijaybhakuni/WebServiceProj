package com.dbhakuni.learning.bean;

public class CalcBean {

	public CalcBean() {
		System.out.println("New Calc Bean");
	}

	
	private int num1;
	private int num2;
	private int result;
	private String operation;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public String toString(){
		return num1 + operation + num2 + "  =  " + result; 
	}
	
}
