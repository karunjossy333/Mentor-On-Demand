package com.mod.service;

import com.mod.entity.ActorsEntity;
import com.mod.entity.MentorDetailsEntity;
import com.mod.entity.UserDetailsEntity;
import com.mod.repository.ActorsRepository;
import com.mod.repository.MentorRepository;
import com.mod.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationService {

    @Autowired
    UserRepository user;
    @Autowired
    ActorsRepository actor;
    @Autowired
    MentorRepository mentor;

    public void addUser(UserDetailsEntity usr) {
        user.save(usr);
    }

    public void addMentor(MentorDetailsEntity ment) {
        mentor.save(ment);
    }

    public List<UserDetailsEntity> getUsers() {
        List<UserDetailsEntity> list = new ArrayList<>();
        user.findAll().forEach(list::add);
        return list;
    }

    public List<MentorDetailsEntity> getMentors() {
        List<MentorDetailsEntity> list = new ArrayList<>();
        mentor.findAll().forEach(list::add);
        return list;
    }

    public UserDetailsEntity getUser(Integer id) {
        return user.findById(id).orElse(null);
    }

    public MentorDetailsEntity getMentor(Integer id) {
        return mentor.findById(id).orElse(null);
    }

    public ActorsEntity getUserName(String accountType, String userName) {
        return actor.searchUserName(accountType, userName);
    }

    public UserDetailsEntity getUsersUserName(String userName) {
        return user.searchUserName(userName);
    }

    public MentorDetailsEntity getMentorsUserName(String userName) {
        return mentor.searchUserName(userName);
    }

    public void deleteUser(Integer id) {
        user.deleteById(id);
    }

    public void deleteMentor(Integer id) {
        mentor.deleteById(id);
    }

    public void updateActor(ActorsEntity act, Integer id) {
        actor.save(act);
    }
}
