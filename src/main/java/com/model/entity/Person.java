package com.model.entity;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "TINYINT(1)", name = "id")
    private int id;

    @Column(name="fullName")
    private String fullname;

    @Column(name ="birth")
    private String birth;

    @Column(name = "created")
    private Timestamp created;

    @Column(name = "updated")
    private Timestamp updated;

    public Person(){

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
