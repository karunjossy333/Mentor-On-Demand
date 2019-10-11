package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CourseDetails;
import com.example.demo.Entity.Technology;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.TechnologyRepository;
@Service
public class TechnologyService {
	

	@Autowired
	private TechnologyRepository techRepo;
	
	public List<Technology> getTechnology() {
		List<Technology> ls=new ArrayList<>();
		techRepo.findAll().forEach(ls::add);
		return ls;
	}
	
	public Technology getTechnology(Integer id) {
		return techRepo.findById(id).orElse(null);
	}

	public void addTechnology(Technology tech) {
		techRepo.save(tech);
	}

	public Technology getTechnology(String techName) {
		return techRepo.searchUserName(techName);
	}

	public void deleteTechnology(Integer id) {
		techRepo.deleteById(id);
	}

	public void updateTechnology(Technology tech, Integer id) {
		techRepo.save(tech);
	}

}
