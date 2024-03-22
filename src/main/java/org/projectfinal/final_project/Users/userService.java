package org.projectfinal.final_project.Users;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service

public class userService {

    @Autowired(required = true)
    private final userRepo userRepo;
    @Autowired
    private final PasswordEncoder passwordEncoder;

    public userService(org.projectfinal.final_project.Users.userRepo userRepo) {
        this.userRepo = userRepo;
    }


    public void saveDataFromCsv(MultipartFile file) throws IOException {
        try (Reader reader = new InputStreamReader(file.getInputStream())) {
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                // Assuming that the first column contains the username and the second column contains the email
                String hitmail = nextRecord[0];
                String password = nextRecord[1];
                String yearEnrolled = nextRecord[2]; // Assuming nextRecord[2] is the yearEnrolled field
                String firstName = nextRecord[3];
                String status = nextRecord[4]; // Assuming nextRecord[4] is the Status field
                String lastName = nextRecord[5];
                String programme = nextRecord[6];
                String department = nextRecord[7];
                String dateString = nextRecord[8];
                String phoneNumber = nextRecord[9];
                String email = nextRecord[10];
                String nextOfKin = nextRecord[11];
                String guardianNumber = nextRecord[12];
                String address = nextRecord[13];

                // Create a Usermodel entity and set the data
                userModel user = new userModel();
                user.setHitmail(hitmail);
                String Genpassword=userRepo.generatePassword(firstName,firstName);
                user.setPassword(password);
                user.setYearEnrolled(yearEnrolled);
                user.setFirstName(firstName);
                user.setStatus(status);
                user.setLastName(lastName);
                user.setProgramme(programme);
                user.setDepartment(department);
                user.setDateOfBirth(dateString);
                user.setPhoneNumber(phoneNumber);
                user.setEmail(email);
                user.setNextOfKin(nextOfKin);
                user.setGuardianNumber(guardianNumber);
                user.setAddress(address);
                userRepo.save(user);
            }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }


    public List<userModel> getAllEUsers() {
        return userRepo.findAll();
    }

    public Optional<userModel> getEventById(userModel userModel) {
        return userRepo.findById(userModel.getHitmail());
    }

    public userModel updateUser(String id, userModel updatedUser) {
        if (userRepo.existsById(updatedUser.getHitmail())) {
            updatedUser.setHitmail(id);
            return userRepo.save(updatedUser);
        } else {
            throw new RuntimeException("Event not found with id: " + id);
        }
    }

}
