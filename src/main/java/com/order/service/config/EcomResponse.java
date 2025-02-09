package com.order.service.config;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * Instantiates a new E-COM response of type T.
 * 
 * @author Mohit.Bindal
 */

@Data
public class EcomResponse<T>
{
	public EcomResponse() {
	}
	public EcomResponse(String message) {
		this.message = message;
	}

	public EcomResponse(String message, HttpStatus status) {
		this.message = message;
		this.setStatus(status);
	}

	public EcomResponse(String message, HttpStatus status, T data) {
		this.message = message;
		this.setStatus(status);
		this.setData(data);
	}

	/** The status. */
	private HttpStatus status;

	/** The status code. */
	private int statusCode;

	/** The message. */
	private String message;

	/** The data. */
	private T data;

	private String encryData;



	/**
	 * Sets the status.
	 * Custom Setter to set both Status and Status Code
	 *
	 * @param status the new status
	 */
	public void setStatus(HttpStatus status)
	{
		this.status = status;
		this.statusCode = status.value();
	}
	
	private Error error;

	@Data
	public static class Error
	{
		private String code;
		private String message;
	}
}
