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
    private String yearEnrolled;
    @Column
    private String firstName;
    @Column
    private String Status;
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

    public String getHitmail() {
        return hitmail;
    }

    public void setHitmail(String hitmail) {
        this.hitmail = hitmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(String yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getGuardianNumber() {
        return GuardianNumber;
    }

    public void setGuardianNumber(String guardianNumber) {
        GuardianNumber = guardianNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
