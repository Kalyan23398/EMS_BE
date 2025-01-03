package com.study.work.EMS_Backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Change to lowercase 'id'

    @Column(name = "first_name")
    private String firstName; // Change to lowercase 'firstName'

    @Column(name = "last_name")
    private String lastName; // Change to lowercase 'lastName'

    public void setEmail(String email) {
        Email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "email", nullable = false, unique = true)
    private String Email; // Change to lowercase 'email'

}