package com.onkar.spring_data_jpa_ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {

    private String sName;
    @Id
    private int rollNo;
    private int marks;

    public String getsName() {

        return sName;
    }

    public void setsName(String sName)
    {
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;
    }

    public int getMarks() {

        return marks;
    }

    public void setMarks(int marks) {

        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
