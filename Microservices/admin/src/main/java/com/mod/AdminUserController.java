package com.mod;

import com.mod.entity.*;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RefreshScope
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminUserController {

    @Autowired
    RestTemplate restTemplate;

    List<UserEntity> user;


    @RequestMapping(value = "/getusers")
    public List<UserEntity> getUsers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

//        return Collections.singletonList(restTemplate.exchange("http://localhost:8201/user/user-list", HttpMethod.GET, entity, UserEntity.class)
//                .getBody());

        ResponseEntity<List<UserEntity>> usersResponse =
                restTemplate.exchange("http://localhost:8201/user/user-list",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<UserEntity>>() {
                        });
        List<UserEntity> users = usersResponse.getBody();
        return users;
    }

    @RequestMapping(value = "/getmentors")
    public List<MentorEntity> getMentors() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List<MentorEntity>> mentorsResponse =
                restTemplate.exchange("http://localhost:8201/mentor/mentor-list",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<MentorEntity>>() {
                        });
        List<MentorEntity> mentors = mentorsResponse.getBody();
        return mentors;
    }

    @RequestMapping(value = "/getuser/{id}")
    public UserEntity getUser(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8201/user/" + id,
                HttpMethod.GET, null, UserEntity.class).getBody();
    }

    @RequestMapping(value = "/getmentor/{id}")
    public MentorEntity getMentor(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8201/mentor/" + id,
                HttpMethod.GET, null, MentorEntity.class).getBody();
    }

    @RequestMapping(value = "/block/{accountType}/{name}")
    public Boolean block(@PathVariable String accountType, @PathVariable String name) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ActorsEntity actor = restTemplate.exchange("http://localhost:8201/actordetails/" + accountType + "/" + name, HttpMethod.GET, entity, ActorsEntity.class)
                .getBody();
        actor.setActorStatus(false);

        HttpEntity<ActorsEntity> entity1 = new HttpEntity<ActorsEntity>(actor, headers);
        return restTemplate.exchange("http://localhost:8201/block-unblock/" + actor.getId(), HttpMethod.PUT, entity1, Boolean.class).getBody();
//            restTemplate.exchange("http://localhost:8201/user/unblock/" + id, HttpMethod.POST, entity, UserEntity.class)
//                    .getBody();
    }


    @RequestMapping(value = "/unblock/{accountType}/{name}")
    public Boolean unblock(@PathVariable String accountType, @PathVariable String name) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ActorsEntity actor = restTemplate.exchange("http://localhost:8201/actordetails/" + accountType + "/" + name, HttpMethod.GET, entity, ActorsEntity.class)
                .getBody();
        actor.setActorStatus(true);

        HttpEntity<ActorsEntity> entity1 = new HttpEntity<ActorsEntity>(actor, headers);
        return restTemplate.exchange("http://localhost:8201/block-unblock/" + actor.getId(), HttpMethod.PUT, entity1, Boolean.class).getBody();

    }

    @RequestMapping(value = "/get-technologies")
    public List<Technology> getTechnology() {
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

    @RequestMapping(value = "/add-technologies")
    public void addTechnology(@RequestBody Technology tech) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Technology> entity = new HttpEntity<Technology>(tech, headers);

        restTemplate.exchange("http://localhost:8203/technology/add", HttpMethod.POST, entity, Boolean.class).getBody();
    }

    @RequestMapping(value = "/update-technologies/{id}")
    public void updateTechnology(@RequestBody Technology tech, @PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Technology> entity = new HttpEntity<Technology>(tech, headers);

        restTemplate.exchange("http://localhost:8203/technology/update/" + id, HttpMethod.PUT, entity, Boolean.class).getBody();
    }

    @RequestMapping(value = "/delete-technologies/{id}")
    public void deleteTechnology(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        restTemplate.exchange("http://localhost:8203/technology/delete/" + id, HttpMethod.DELETE, entity, Boolean.class).getBody();
    }

    @RequestMapping(value = "/courses")
    public List<CourseDetails> courses() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List<CourseDetails>> courseResponse =
                restTemplate.exchange("http://localhost:8203/coursedetails/course-list",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<CourseDetails>>() {
                        });
        List<CourseDetails> courses = courseResponse.getBody();
        return courses;
    }

}
