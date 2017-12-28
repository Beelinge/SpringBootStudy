package com.example.demo02.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_student")
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;

//    @Id
//    @GeneratedValue(generator = "name")
//    @GenericGenerator(name = "name", strategy = "assigned")
//    @Column(length = 32)
    private String name;

    @Transient
    private String age;

    @Embedded
    private Parent parent;

    public Student() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
