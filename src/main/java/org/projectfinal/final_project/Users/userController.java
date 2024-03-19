package org.projectfinal.final_project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
public class userController {

    @Autowired
    private final userService userService;

    public userController(org.projectfinal.final_project.Users.userService userService) {
        this.userService = userService;
    }

    @PostMapping("/upload-csv")
    public ResponseEntity<String> uploadCsv(@RequestParam("file") MultipartFile file) {
        try {
            userService.saveDataFromCsv(file);
            return ResponseEntity.ok("CSV file uploaded and data saved successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while processing the CSV file.");
        }
    }
}
