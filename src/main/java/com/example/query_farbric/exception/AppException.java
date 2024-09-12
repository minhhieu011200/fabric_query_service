package com.example.query_farbric.exception;

public class AppException extends RuntimeException{
	ErrorCode errorCode;

	public AppException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
}
