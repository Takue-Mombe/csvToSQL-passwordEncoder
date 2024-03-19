package org.projectfinal.final_project.Users;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class userModel {

    @Id
    private String hitmail;
    @Column
    private String password;
    @Column
    private int yearEnrolled;
    @Column
    private String firstName;
    @Column
    private Status Status;
    @Column
    private String lastName;
    @Column
    private String programme;
    @Column
    private String department;
    @Column
    private Date dateOfBirth;
    @Column
    private Long phoneNumber;
    @Column
    private String email;
    @Column
    private String nextOfKin;
    @Column
    private String GuardianNumber;
    @Column
    private String Address;
}
