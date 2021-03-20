package com.springbootactor.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbootactor.microservice.model.Actor;
import com.springbootactor.microservice.servicesImpl.ActorService;

@RestController
public class ActorController {

	@Autowired
	ActorService actorService;
	
	@GetMapping(value = "/getActorsByIndustry/{industryName}")
	public List<Actor> getActors(@PathVariable String industryName) {

		List<Actor> studentList = actorService.getActorsByIndustryName(industryName);
		
		return studentList;
	}
	
}
