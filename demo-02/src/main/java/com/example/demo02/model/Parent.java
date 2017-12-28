package com.example.demo02.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Parent {
    private String fa_name;
    private String mo_name;

    public Parent() {

    }
    public String getFa_name() {
        return fa_name;
    }

    public void setFa_name(String fa_name) {
        this.fa_name = fa_name;
    }

    public String getMo_name() {
        return mo_name;
    }

    public void setMo_name(String mo_name) {
        this.mo_name = mo_name;
    }
}
