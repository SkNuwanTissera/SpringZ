package com.example.demo.Entities;

import com.example.demo.topics.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String>{

}
