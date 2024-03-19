package org.projectfinal.final_project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    @Autowired(required = true)
    private final userRepo userRepo;

    public userService(org.projectfinal.final_project.Users.userRepo userRepo) {
        this.userRepo = userRepo;
    }

    public userModel saveUserModel(userModel UserModel){
        return userRepo.save(UserModel);
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
