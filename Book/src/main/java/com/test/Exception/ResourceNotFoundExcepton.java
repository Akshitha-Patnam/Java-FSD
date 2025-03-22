package com.test.Exception;

public class ResourceNotFoundExcepton extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepton(String msg)
	{
		super(msg);
	}
}

