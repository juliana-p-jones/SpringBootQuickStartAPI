package io.javabrains.springbootstarter.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired //injecting an instance of TopicR so that this class can reference it
    private TopicRepository topicRepository;

   private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework description"),
                new Topic("java", "Core Java", "Core Java description"),
                new Topic("javascript", "JavaScript", "JavaScript description") ));

   public List<Topic> getAllTopics(){
       List<Topic> topics = new ArrayList<>();
       topicRepository.findAll()
       .forEach(topics::add);
       return topics;
   }

   public Optional<Topic> getTopic(String id){
     // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
       return topicRepository.findById(id);
   }

   public void addTopic(Topic topic){
       topicRepository.save(topic);
       //topics.add(topic);
   }

    public void updateTopic(String id, Topic topic) {
       topicRepository.save(topic); // save can do both add and update
//       for (int i = 0; i< topics.size(); i++){
//           Topic t = topics.get(i);
//           if(t.getId().equals(id)) {
//               topics.set(i, topic);
//               return;
//           }
//       }
    }
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
//        topics.removeIf(t -> t.getId().equals(id));
    }
}
