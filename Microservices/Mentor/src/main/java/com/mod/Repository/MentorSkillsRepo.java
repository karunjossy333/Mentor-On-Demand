package com.mod.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.mod.Entity.MentorSkills;

import java.util.List;


public interface MentorSkillsRepo extends CrudRepository<MentorSkills, Integer>{

    @Query(value="select * from mentor_skills m where m.tech_id = ?1",nativeQuery = true)
    List<MentorSkills> getSkills(Integer techId);

}
