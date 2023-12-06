package com.luv2code.Spring_JPA_Advanced_Mapping.Dao;

import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.Instructor;

public interface AppDao {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
}
