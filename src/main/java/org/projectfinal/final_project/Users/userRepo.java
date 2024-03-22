package org.projectfinal.final_project.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface userRepo extends JpaRepository<userModel,String> {

    default String generatePassword(String firstName,String hitmail){
        return firstName.substring(0,3)+hitmail.hashCode();
    }
}
