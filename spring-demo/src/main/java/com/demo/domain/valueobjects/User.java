package com.demo.domain.valueobjects;


import javax.persistence.*;


@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
