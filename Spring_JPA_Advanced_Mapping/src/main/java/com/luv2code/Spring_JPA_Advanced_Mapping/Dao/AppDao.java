package com.luv2code.Spring_JPA_Advanced_Mapping.Dao;

import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.Instructor;
import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.InstructorDetails;

public interface AppDao {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    InstructorDetails findInstructorDetailsById(int theId);
    void deleteInstructorDetailsById(int theId);

}
