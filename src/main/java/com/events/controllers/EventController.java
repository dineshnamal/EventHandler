package com.events.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.events.domain.Event;
import com.events.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;

	@GetMapping(path = "/events")
	public List<Event> findEvents() {
		return eventService.getEvents();

	}

}
