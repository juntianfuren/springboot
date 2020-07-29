package com.jtfr.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.jtfr.entity.UserDO;

public interface UserRepository02 extends MongoRepository<UserDO, Integer> {

    UserDO findByUsername(String username);

    Page<UserDO> findByUsernameLike(String username, Pageable pageable);

}