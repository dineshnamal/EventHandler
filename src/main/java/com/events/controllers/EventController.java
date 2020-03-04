package com.events.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.events.domain.Event;
import com.events.service.dao.EventDao;

@RestController
public class EventController {
	
	@Autowired
	private EventDao eventService;

	@GetMapping(path = "/events")
	public List<Event> findAllEvents() {
		return eventService.findAllEvents();
	}
	
	@GetMapping(path = "/events/{id}")
	public Event findEventById(Integer id) {
		return eventService.findEventById(id);
	}
	
	@GetMapping(path = "/events/{name}")
	public Event findEventByName(String name) {
		return eventService.findEventByName(name);
	}
	
	@GetMapping(path ="/events/{fromDate}")
	public List<Event> findEventsByDate(String fromDate){
		return eventService.findEventsByDate(fromDate);

	}
	
	

}
