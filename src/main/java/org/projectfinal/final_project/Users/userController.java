package org.projectfinal.final_project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api")
public class userController {

    @Autowired
    private final userService userService;

    public userController(org.projectfinal.final_project.Users.userService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public List<userModel> getUsers(){
        return userService.getAllEUsers();
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadCsv(@RequestParam("file") MultipartFile file) {
        try {
            System.out.println("hello");
            userService.saveDataFromCsv(file);
            return ResponseEntity.ok("CSV file uploaded and data saved successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while processing the CSV file.");
        }
    }
}
