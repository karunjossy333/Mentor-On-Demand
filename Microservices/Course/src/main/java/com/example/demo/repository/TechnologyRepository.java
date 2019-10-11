package com.example.demo.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Technology;

public interface TechnologyRepository extends CrudRepository<Technology, Integer>{

    @Query(value="select * from technology tech where tech.tech_name = ?1 ",nativeQuery = true)
    Technology searchUserName(String techName);

}
