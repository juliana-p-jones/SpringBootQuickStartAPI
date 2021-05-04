package io.javabrains.springbootstarter.courseapi.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    //<Which class, the class key ID type>

    //method to get all topics getAllTopics()
    //method to get topic getTopic(String id)
    //updateTopic(String id)
    //deleteTopic(String id)
    //CrudRepository
    //then we add our own specific methods

}
