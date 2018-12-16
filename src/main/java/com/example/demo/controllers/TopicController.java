package com.example.demo.controllers;

import com.example.demo.services.TopicService;
import com.example.demo.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi";
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();

    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){

        return topicService.getTopic(id);

    }

    @RequestMapping(value = "/topics",method = POST)
    public void addTopic(@RequestBody Topic topic){
         topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}",method = PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(value = "/topics/{id}",method = DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
