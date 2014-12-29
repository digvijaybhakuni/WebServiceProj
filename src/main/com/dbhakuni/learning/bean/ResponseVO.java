/**
 * 
 */
package com.dbhakuni.learning.bean;

/**
 * @author digvijayb
 *
 */
public class ResponseVO<T> {

	/**
	 * 
	 */
	public ResponseVO() {}

	
	
	public ResponseVO(String responseStatus, String responseText, T result) {
		super();
		this.responseStatus = responseStatus;
		this.responseText = responseText;
		this.result = result;
	}



	private String responseStatus;
	private String responseText;
	
	private T result;

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	
}
