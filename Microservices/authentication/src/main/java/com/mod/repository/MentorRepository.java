package com.mod.repository;

import com.mod.entity.MentorDetailsEntity;
import com.mod.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MentorRepository extends CrudRepository<MentorDetailsEntity, Integer> {
    @Query(value="select * from mentor_details mentor where mentor.mentor_email = ?1 ",nativeQuery = true)
    MentorDetailsEntity searchUserName(String userName);
}
