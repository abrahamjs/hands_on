package com.company.studentrepository.dao;

import com.company.studentrepository.model.Course;
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
public class CourseDaoTest {

    @Autowired
    CourseDao courseDao;

    private Course course;
    private Course course1;
    private List<Course> courses;

    @Before
    public void setUp() {
        courseDao.deleteAll();

        course = new Course();
        course.setName("Math");
        course.setScore(100);

        courses = Arrays.asList(course);

    }

    @Test
    public void shouldAddGetAndDeleteStudent(){
        course = courseDao.save(course);

        assertEquals(course, courseDao.getOne(course.getStudent_id()));

        courseDao.delete(course);
        course1 = courseDao.getOne(course.getStudent_id());
        assertNull(course1);

    }

    @Test
    public void shouldGetAllStudents(){
        courseDao.save(course);

        assertEquals(1, courseDao.findAll().size());
    }


}