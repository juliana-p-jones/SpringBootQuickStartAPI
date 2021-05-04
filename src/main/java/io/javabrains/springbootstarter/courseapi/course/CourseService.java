package io.javabrains.springbootstarter.courseapi.course;

import io.javabrains.springbootstarter.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service //service class gets stereotype service annotation
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String id){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll()
                .forEach(courses::add);
        return courses;
    }
    public Optional<Course> getCourse(String id){
       return courseRepository.findById(id);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
        courseRepository.save(course); // save can do both add and update
    }
    public void deleteCourses(String id){
        courseRepository.deleteById(id);
    }
}
