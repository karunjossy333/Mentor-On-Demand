package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.CourseDetails;
import com.example.demo.Entity.Technology;
import com.example.demo.service.CourseService;
import com.example.demo.service.TechnologyService;

@RestController
@EnableEurekaClient
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

	@Autowired
	private CourseService cs;
	@Autowired
	private TechnologyService techService;

	@RequestMapping("/technology/list-tech")
	public List<Technology> getTechnology() {
		return techService.getTechnology();
	}

	@RequestMapping("/technology/{id}")
	public Technology getTechnology(@PathVariable Integer id) {
		return techService.getTechnology(id);
	}

	@RequestMapping("/technology/details/{techName}")
	public Technology getTechnology(@PathVariable String techName) {
		return techService.getTechnology(techName);
	}

	@RequestMapping(method=RequestMethod.POST,value="/technology/add")
	public void addTechnology(@RequestBody Technology ts) {
		techService.addTechnology(ts);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/technology/update/{id}")
	public void updateTechnology(@RequestBody Technology ts, @PathVariable Integer id) {
		techService.updateTechnology(ts, id);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/technology/delete/{id}")
	public void deleteTechnology(@PathVariable Integer id) {
		techService.deleteTechnology(id);
	}
	
	@RequestMapping("/coursedetails/course-list")
	public List<CourseDetails> getCourse() {
	return cs.getCourse();
	}
	
	@RequestMapping("/coursedetails/{id}")
	public CourseDetails getCourseDetails(@PathVariable Integer id) {
		return cs.getCourseDetails(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/course/add-course")
	public void addCourse(@RequestBody CourseDetails cd) {
		cs.addCourse(cd);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/course/update")
	public void updateCourse(@RequestBody CourseDetails cd) {
		cs.updateCourse(cd);
	}

	@RequestMapping("/course/user/{id}")
	public List<CourseDetails> getUserCourse(@PathVariable Integer id) {
		return cs.getUserCourse(id);
	}

	@RequestMapping("/course/mentor/{mentorId}/{techId}")
	public List<CourseDetails> getMentorCourse(@PathVariable Integer mentorId, @PathVariable Integer techId) {
		return cs.getMentorCourse(mentorId, techId);
	}

}