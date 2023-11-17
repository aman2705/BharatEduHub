package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Course;
import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    public List<Course> getallcourses() {
        return courseRepository.findAll();
    }

    public Course searchcourse(Integer id) {
        return  courseRepository.getReferenceById(id);
    }

    public Course updatecourse(Integer id, Course updated) {

        Course existingCourse=courseRepository.getReferenceById(id);
        existingCourse.setDescription(updated.getDescription());
        existingCourse.setDuration(updated.getDuration());
        existingCourse.setTitle(updated.getTitle());
        existingCourse.setVideocount(updated.getVideocount());
        existingCourse.setModulecount(updated.getModulecount());

        return  existingCourse;
    }
}
