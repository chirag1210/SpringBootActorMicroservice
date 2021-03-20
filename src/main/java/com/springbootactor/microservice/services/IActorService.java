package com.springbootactor.microservice.services;

import java.util.List;

import com.springbootactor.microservice.model.Actor;

public interface IActorService {

	public List<Actor> getActorsByIndustryName(String industryName);

}
