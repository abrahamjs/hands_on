package com.company.studentrepository.controller;

import com.company.studentrepository.dao.CourseDao;
import com.company.studentrepository.dao.StudentDao;
import com.company.studentrepository.model.Course;
import com.company.studentrepository.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value="/course", method = RequestMethod.POST)
    public Course createStudent(@RequestBody Course course) {
        return courseDao.save(course);

    }
    @RequestMapping(value="/course/{id}", method = RequestMethod.GET)
    public Course getStudentById(@PathVariable int id) {
        return courseDao.findById(id).get();
    }
    @RequestMapping(value="/course/{id}", method = RequestMethod.PUT)
    public void updateCar(@RequestBody Course course, @PathVariable int id) {
        courseDao.save(course);
    }
    @RequestMapping(value="/course/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable int id) {
        courseDao.deleteById(id);
    }
    @RequestMapping(value="/course", method = RequestMethod.GET)
    public List<Course> getAllStudents() {
        return courseDao.findAll();
    }

}
