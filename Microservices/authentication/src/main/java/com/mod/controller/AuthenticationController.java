package com.mod.controller;

import com.mod.entity.ActorsEntity;
import com.mod.entity.MentorDetailsEntity;
import com.mod.entity.UserDetailsEntity;
import com.mod.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableEurekaClient
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;

    @RequestMapping(method= RequestMethod.POST, value="/user/signup")
    public void addUser(@RequestBody UserDetailsEntity user) {
        service.addUser(user);
    }

    @RequestMapping(method= RequestMethod.POST, value="/mentor/signup")
    public void addMentor(@RequestBody MentorDetailsEntity mentor) {
        service.addMentor(mentor);
    }

    @RequestMapping("/user/user-list")
    public List<UserDetailsEntity> getUsers() {
        return service.getUsers();
    }

    @RequestMapping("/mentor/mentor-list")
    public List<MentorDetailsEntity> getMentors() {
        return service.getMentors();
    }

    @RequestMapping("/user/{id}")
    public UserDetailsEntity getUser(@PathVariable Integer id) {
        return service.getUser(id);
    }

    @RequestMapping("/mentor/{id}")
    public MentorDetailsEntity getMentor(@PathVariable Integer id) {
        return service.getMentor(id);
    }

    @RequestMapping("/actordetails/{accountType}/{userName}")
    public ActorsEntity getUserCred(@PathVariable String accountType, @PathVariable String userName){
        return service.getUserName(accountType, userName);
    }

    @RequestMapping("/user/details/{userName}")
    public UserDetailsEntity getUsersUserName(@PathVariable String userName){
        return service.getUsersUserName(userName);
    }

    @RequestMapping("/mentor/details/{userName}")
    public MentorDetailsEntity getMentorsUserName(@PathVariable String userName){
        return service.getMentorsUserName(userName);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/user/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/mentor/delete/{id}")
    public void deleteMentor(@PathVariable Integer id) {
        service.deleteMentor(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/block-unblock/{id}")
    public Boolean blockUnblock(@RequestBody ActorsEntity actor, @PathVariable Integer id) {
        service.updateActor(actor, id);
        return true;
    }

}
