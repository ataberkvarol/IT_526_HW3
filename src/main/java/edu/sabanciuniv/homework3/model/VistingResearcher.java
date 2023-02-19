package edu.sabanciuniv.homework3.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class VistingResearcher extends Instructors {

    @Column
    private String paymentType;

    public VistingResearcher(){

    }

    public VistingResearcher(String paymentType) {
        this.paymentType = paymentType;
    }

    public VistingResearcher(String name, String address, long phoneNumber, String paymentType) {
        super(name, address, phoneNumber);
        this.paymentType = paymentType;
    }


    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = "hourly salary";
    }

    @Override
    public String toString() {
        return "Vistingreseacher{" +
                "paymentType='" + paymentType + '\'' +
                '}';
    }
}
