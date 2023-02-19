package edu.sabanciuniv.homework3.main;

import edu.sabanciuniv.homework3.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Homework3Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework3Application.class, args);
        List<Student> studentList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        List<Instructors> instructorsList = new ArrayList<>();
        Date d1 = new Date(1998, Calendar.SEPTEMBER,23);
        Date d2 = new Date(1998,Calendar.FEBRUARY,19);
        Student s1 = new Student("ataberk","male","maltepe",d1);
        Student s2 = new Student("uğur","male","kartal",d2);
        studentList.add(s1);
        studentList.add(s2);
        Course c1 = new Course("Comm. theory",405,4);
        Course c2 = new Course("Antenna Propogation",451,3);
        Instructors i1 = new PermanentInstructor("cahit","kayisdagi",123456,"fixed salary");
        Instructors i2 = new VistingResearcher("engin","göztepe",789456,"hourly");
        courseList.add(c1);
        courseList.add(c2);
        instructorsList.add(i1);
        instructorsList.add(i2);

        s1.setStudentCourse(c1);
        s2.setStudentCourse(c2);

        c1.setCourseInstructors(i1);
        c2.setCourseInstructors(i2);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager entityManager = emf.createEntityManager();

        for(Student std :studentList ){
            entityManager.getTransaction().begin();
            entityManager.persist(std);
            entityManager.getTransaction().commit();


        }

        for (Course crs : courseList){

            entityManager.getTransaction().begin();
            entityManager.persist(crs);
            entityManager.getTransaction().commit();
        }

        for (Instructors ins : instructorsList){

            entityManager.getTransaction().begin();
            entityManager.persist(ins);
            entityManager.getTransaction().commit();

        }

            entityManager.close();


    }

}
