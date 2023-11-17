package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.Course;
import com.example.BharatEduHub.Service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bharateduhub")
@RequiredArgsConstructor
public class CourseController {

    @Autowired
    private CourseService courseService;
    @GetMapping("/api/courses")
    private List<Course> getallcourses(){
       return courseService.getallcourses();
    }

    @GetMapping("/api/courses/{course_id}")
    private Course getSingleCourse(@PathVariable Integer course_id){
        return courseService.searchcourse(course_id);
    }

    @PutMapping("/api/courses/{course_id}")
    private Course updateCourse(@PathVariable Integer course_id, @RequestBody Course updatedCourse){
        return courseService.updatecourse(course_id,updatedCourse);
    }

}
