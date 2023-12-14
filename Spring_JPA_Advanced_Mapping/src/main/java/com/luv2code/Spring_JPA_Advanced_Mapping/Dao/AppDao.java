package com.luv2code.Spring_JPA_Advanced_Mapping.Dao;

import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.Course;
import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.Instructor;
import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.InstructorDetails;

import java.util.List;

public interface AppDao {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    InstructorDetails findInstructorDetailsById(int theId);
    void deleteInstructorDetailsById(int theId);
    List<Course> findCourseByInstructorId(int theId);
    void update(Instructor tempInstructor);
    void updateTheCourse(Course tempCourse);
    Course findCourseById(int theid);
    void save(Course theCourse);
    Course findCourseAndReviewsByCourseId(int theId);
}
