package com.ads.mydata.api.exception;

public class FileStorageException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5869278871034326168L;

	public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
