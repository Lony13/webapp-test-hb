package com.hibernate.webapp.repository;

import com.hibernate.webapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
