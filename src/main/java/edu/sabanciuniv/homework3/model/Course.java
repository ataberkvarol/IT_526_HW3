package edu.sabanciuniv.homework3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    @Column
    private String courseName;
    @Column
    private int courseCode;
    @Column
    private double creditScore;
    @OneToMany(mappedBy = "studentCourse",cascade = CascadeType.ALL)
    private List<Student> studentList = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    private Instructors courseInstructors;


    public Course() {
    }

    public Course(String courseName, int courseCode, double creditScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Instructors getCourseInstructors() {
        return courseInstructors;
    }

    public void setCourseInstructors(Instructors courseInstructors) {
        this.courseInstructors = courseInstructors;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", creditScore=" + creditScore +
                ", studentList=" + studentList +
                ", courseInstructors=" + courseInstructors +
                '}';
    }
}
