package edu.sabanciuniv.homework3.model;

import javax.persistence.*;

@Entity
public class PermanentInstructor extends Instructors{


    @Column
    private  String paymentType;

    public PermanentInstructor(){

    }


    public PermanentInstructor(String paymentType) {
        this.paymentType = paymentType;
    }

    public PermanentInstructor(String name, String address, long phoneNumber, String paymentType) {
        super(name, address, phoneNumber);
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = "fixed salary";
    }

    @Override
    public String toString() {
        return "Permanentinstructor{" +
                "paymentType='" + paymentType + '\'' +
                '}';
    }
}
