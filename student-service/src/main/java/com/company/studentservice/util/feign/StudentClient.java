package com.company.studentservice.util.feign;

import com.company.studentservice.model.Course;
import com.company.studentservice.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "STUDENT-REPOSITORY")
public interface StudentClient {
    @RequestMapping(value="/course", method = RequestMethod.POST)
    Course createStudent(@RequestBody Course course);

    @RequestMapping(value="/course/{id}", method = RequestMethod.GET)
    Course getStudentById(@PathVariable int id);

    @RequestMapping(value="/course/{id}", method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Course course, @PathVariable int id) ;

    @RequestMapping(value="/course/{id}", method = RequestMethod.DELETE)
    void deleteStudent(@PathVariable int id);

    @RequestMapping(value="/course", method = RequestMethod.GET)
     List<Course> getAllStudents();

    @RequestMapping(value="/students", method = RequestMethod.POST)
    Student createCourse(@RequestBody Student student);

    @RequestMapping(value="/students/{id}", method = RequestMethod.GET)
    Student getCourse(@PathVariable int id);

    @RequestMapping(value="/students/{id}", method = RequestMethod.PUT)
    void updateCourse(@RequestBody Student student, @PathVariable int id) ;

    @RequestMapping(value="/students/{id}", method = RequestMethod.DELETE)
    void deleteCourse(@PathVariable int id);

    @RequestMapping(value="/students", method = RequestMethod.GET)

    }

