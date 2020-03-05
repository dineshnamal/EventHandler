package com.events.domain;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Size;

public class Event {
	private Integer id;
	@Size(min = 10)
	private String name;
	@FutureOrPresent
	private LocalDate eventDate;

	public Event(Integer id, String name, LocalDate eventDate) {
		super();
		this.id = id;
		this.name = name;
		this.eventDate = eventDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

}
