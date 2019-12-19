package com.company.studentrepository.dao;



import com.company.studentrepository.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    private Student student;
    private Student student1;
    private List<Student> students;

    @Before
    public void setUp() {
        studentDao.deleteAll();

        student = new Student();
        student.setFirstName("Jose");
        student.setLastName("Sanchez");

        students = Arrays.asList(student);

    }

    @Test
    public void shouldAddGetAndDeleteStudent(){
        student = studentDao.save(student);

        assertEquals(student, studentDao.getOne(student.getId()));

        studentDao.delete(student);
        student1 = studentDao.getOne(student.getId());
        assertNull(student1);

    }

    @Test
    public void shouldGetAllStudents(){
        studentDao.save(student);

        assertEquals(1, studentDao.findAll().size());
    }
}