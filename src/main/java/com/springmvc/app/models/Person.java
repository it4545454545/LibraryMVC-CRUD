package com.springmvc.app.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "Can not be empty, Min 2 - Max 50 symbols")
    @Size(min=2,max=50, message = "Min 2 - Max 50 symbols")
    private String fio;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "The format must be 2022-09-29")
    private String bd;
    public Person() {}
    public Person(int id, String name, String bd) {
        this.id = id;
        this.fio = name;
        this.bd = bd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

}