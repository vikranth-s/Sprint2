  
package com.cpg.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductException extends Exception{
	
	public ProductException(String message)
	{
		super(message);
	}

}
