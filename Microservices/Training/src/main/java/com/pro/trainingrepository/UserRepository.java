package com.pro.trainingrepository;


import org.springframework.data.repository.CrudRepository;

import com.pro.trainingentity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
}
