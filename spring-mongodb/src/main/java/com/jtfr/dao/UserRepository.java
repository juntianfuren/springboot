package com.jtfr.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jtfr.entity.UserDO;

//第一个泛型设置对应的实体是 UserDO ，第二个泛型设置对应的主键类型是 Integer 。
//实现了 MongoRepository 接口，Spring Data MongoDB 会自动生成对应的 CRUD 等等的代码
public interface UserRepository extends MongoRepository<UserDO, Integer> {}