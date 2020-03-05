package com.events.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	private LocalDateTime timestamp;
	private String message;
	private String detailMessage;

	public ExceptionResponse(LocalDateTime timestamp, String message, String detailMessage) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detailMessage = detailMessage;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetailMessage() {
		return detailMessage;
	}

}
