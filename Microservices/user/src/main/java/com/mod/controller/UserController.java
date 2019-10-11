package com.mod.controller;

import com.mod.entity.CourseDetails;
import com.mod.entity.MentorCalendar;
import com.mod.entity.MentorSkills;
import com.mod.entity.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/user/technologies")
    public List<Technology> getTechnologies() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List<Technology>> technologyResponse =
                restTemplate.exchange("http://localhost:8203/technology/list-tech",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Technology>>() {
                        });
        List<Technology> technologies = technologyResponse.getBody();
        return technologies;
    }

    @RequestMapping("/search/{techId}/{timeSlot}")
    public  List<MentorCalendar> getAvailableCourses(@PathVariable Integer techId, @PathVariable String timeSlot) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List<MentorSkills>> skillsResponse =
                restTemplate.exchange("http://localhost:8204/mentorskills/" + techId,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<MentorSkills>>() {
                        });
        List<MentorSkills> skills = skillsResponse.getBody();
        List<MentorCalendar> calendar = new ArrayList<>();

        for ( MentorSkills s : skills ) {
            ResponseEntity<MentorCalendar> cal =  restTemplate.exchange("http://localhost:8204/mentorcalendar/" + s.getMentorId() + "/" + timeSlot, HttpMethod.GET, null, MentorCalendar.class);
            if( cal.getBody() != null )
                calendar.add(cal.getBody());
        }
        return calendar;
    }

    @RequestMapping("/registercourse")
    public void registerCourse(@RequestBody CourseDetails cd) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<CourseDetails> entity = new HttpEntity<CourseDetails>(cd, headers);

        restTemplate.exchange("http://localhost:8203/course/add-course", HttpMethod.POST, entity, Boolean.class).getBody();
    }

    @RequestMapping("/updatecourse")
    public void updateCourse(@RequestBody CourseDetails cd) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<CourseDetails> entity = new HttpEntity<CourseDetails>(cd, headers);

        restTemplate.exchange("http://localhost:8203/course/update", HttpMethod.PUT, entity, Boolean.class).getBody();
    }
}
