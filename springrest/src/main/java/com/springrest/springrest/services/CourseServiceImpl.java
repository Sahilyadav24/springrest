package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course","this course contains basics of java"));
        list.add(new Course(146, "Spring Boot","this course contains basics of Spring Boot"));
    }

    @Override
    public List<Course> getCourses(){
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course : list){
            if (course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
