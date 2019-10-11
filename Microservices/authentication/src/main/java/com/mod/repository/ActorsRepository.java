package com.mod.repository;

import com.mod.entity.ActorsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ActorsRepository extends CrudRepository<ActorsEntity, Integer> {
    @Query(value="select * from actors a where a.actor_type = ?1 && a.actor_email = ?2 ",nativeQuery = true)
    ActorsEntity searchUserName(String accountType, String userName);
}
