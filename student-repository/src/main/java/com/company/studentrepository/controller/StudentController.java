package com.company.studentrepository.controller;

import com.company.studentrepository.dao.StudentDao;
import com.company.studentrepository.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value="/students", method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student) {
        studentDao.save(student);
        return student;
    }
    @RequestMapping(value="/students/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable int id) {
        return studentDao.findById(id).get();
    }
    @RequestMapping(value="/students/{id}", method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student, @PathVariable int id) {
        studentDao.save(student);
    }
    @RequestMapping(value="/students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int id) {
        studentDao.deleteById(id);
    }
    @RequestMapping(value="/students", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

}
