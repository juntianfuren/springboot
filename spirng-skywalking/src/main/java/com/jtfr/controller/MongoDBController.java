
package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.entity.UserDO;

@RestController
@RequestMapping("/mongodb")
public class MongoDBController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/test")
    public String test() {
        UserDO userDO = this.findById(1);
        System.out.println("userDO---------------" + userDO);
        return "mongodb";
    }

    public UserDO findById(Integer id) {
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)), UserDO.class);
    }
}
