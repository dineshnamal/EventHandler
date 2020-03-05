package com.events.service.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.events.domain.Event;

@Component
public class EventDao {

	private static List<Event> events = new ArrayList<Event>();

	static {
		events.add(new Event(1, "Thisali BirthDay Party", LocalDate.of(2020, 2, 29)));
		events.add(new Event(2, "Vindi BirthDay ", LocalDate.of(2020, 3, 12)));
		events.add(new Event(3, "New Year", LocalDate.of(2020, 4, 13)));

	}

	public List<Event> findAllEvents() {
		return events;
	}

	public Event findEventById(Integer id) {
		for (Event event : events) {
			if (event.getId() == id) {
				return event;
			}
		}
		return null;
	}

	public Event findEventByName(String eventName) {
		for (Event event : events) {
			if (eventName.equals(event.getName())) {
				return event;
			}
		}
		return null;
	}

	public List<Event> findEventsByDate(String fromDate) {
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(fromDate, sdf);
		List<Event> filteredEvets = new ArrayList<Event>();
		for (Event event : events) {

			if (event.getEventDate().isAfter(localDate)) {
				filteredEvets.add(event);
			}
		}

		return filteredEvets;
	}

	public Event saveEvent(Event event) {
		events.add(event);
		return event;
	}

}
