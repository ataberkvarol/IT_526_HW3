package edu.sabanciuniv.homework3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int instructorId;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private long phoneNumber;

    @OneToMany(mappedBy ="courseInstructors",cascade = CascadeType.ALL)
    private List<Course> instructorCourseList = new ArrayList<>();

    public Instructors() {
    }

    public Instructors(String name, String address, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> getInstructorCourseList() {
        return instructorCourseList;
    }

    public void setInstructorCourseList(List<Course> instructorCourseList) {
        this.instructorCourseList = instructorCourseList;
    }


    @Override
    public String toString() {
        return "Instructors{" +
                "instructorId=" + instructorId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", instructorCourseList=" + instructorCourseList +
                '}';
    }
}
