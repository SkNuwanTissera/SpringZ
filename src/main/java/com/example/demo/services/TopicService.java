package com.example.demo.services;

import com.example.demo.topics.Topic;
import com.example.demo.Entities.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring1","Spring Framework","Soring Framework Description"),
//            new Topic("spring2","Spring Framework","Soring Framework Description"),
//            new Topic("spring3","Spring Framework","Soring Framework Description")
//    ));

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;

    }

    public Topic getTopic(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
//        for(int i = 0; i < topics.size(); i++){
//            if(topics.get(i).getId().equals(id)){
//                topics.set(i,topic);
//                return;
//            }
//            else{
//                System.out.println("Error");
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t-> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
