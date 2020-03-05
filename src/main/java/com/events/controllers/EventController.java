package com.events.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.events.domain.Event;
import com.events.exception.EventException;
import com.events.service.dao.EventDao;

@RestController
public class EventController {
	
	@Autowired
	private EventDao eventService;

	@GetMapping(path = "/events")
	public List<Event> findAllEvents() {
		return eventService.findAllEvents();
	}
	
	@GetMapping(path = "/events/event/{id}")
	public Event findEventById(@PathVariable Integer id) {
		Event event = eventService.findEventById(id);
		if(event == null) {
			throw new EventException("Event Not Found id"+id);
		}
		
		return event;
	}
	
	@GetMapping(path = "/events/{name}")
	public Event findEventByName(@PathVariable String name) {
		return eventService.findEventByName(name);
	}
	//yyyy-MM-dd
	@GetMapping(path ="/events/{fromDate}/{toDate}")
	public List<Event> findEventsByDate(@PathVariable String fromDate){
		return eventService.findEventsByDate(fromDate);
	}
	
	@PostMapping("/events")
	public Event saveEvent(@Valid @RequestBody Event event) {
		return eventService.saveEvent(event);
	}
	
	

}
