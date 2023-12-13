package com.luv2code.Spring_JPA_Advanced_Mapping;

import com.luv2code.Spring_JPA_Advanced_Mapping.Dao.AppDao;
import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.Instructor;
import com.luv2code.Spring_JPA_Advanced_Mapping.Entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaAdvancedMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaAdvancedMappingApplication.class, args);
    }

    @Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){
		return runner-> {
			/*createInstructor(appDao);

			findInstructor(appDao);*/

			/*deleteInstructor(appDao);*/

			findInstructorDetails(appDao);
		};
	}

	private void findInstructorDetails(AppDao appDao) {
		int theId = 1;
		InstructorDetails tempInstructor = appDao.findInstructorDetailsById(theId);
		System.out.println("Instructor Details:" + tempInstructor);
		System.out.println("Associated instructor: " + tempInstructor.getInstructor());
		System.out.println("done...!!!");
	}

	private void deleteInstructor(AppDao appDao) {
		int theId= 2;
		System.out.println("Deleting the Instructor with Id: " + theId);

		appDao.deleteInstructorById(theId);

		System.out.println("Done with Deletion Process");
	}

	private void findInstructor(AppDao appDao) {
		int theId = 1;

		Instructor tempInstructor = appDao.findInstructorById(theId);
		System.out.println("Instructor  with ID " + theId + ":" + tempInstructor);
		System.out.println("Instructor Details:" + tempInstructor.getInstructorDetails());
	}

	private void createInstructor(AppDao appDao) {
		Instructor tempInstructor = new Instructor("Prexa", "Shah", "meeshah7199@gmail.com");
		InstructorDetails tempInstructorDetails = new InstructorDetails("http://www.meetshah.com", "Singing");

		tempInstructor.setInstructorDetails(tempInstructorDetails);

		System.out.println("Saving Instructor: " + tempInstructor);
		appDao.save(tempInstructor);
		System.out.println("Done..");
	}

}
