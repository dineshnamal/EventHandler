package com.events.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.events.domain.Event;

@Component
public class EventService {

	private static List<Event> events = new ArrayList<Event>();

	static {
		events.add(new Event(1, "Thisali BirthDay Party", LocalDate.of(2020, 2, 29)));
		events.add(new Event(1, "Vindi BirthDay ", LocalDate.of(2020, 3, 12)));
		events.add(new Event(1, "New Year", LocalDate.of(2020, 4, 13)));

	}

	public List<Event> getEvents() {
		// TODO Auto-generated method stub
		return events;
	}

}
