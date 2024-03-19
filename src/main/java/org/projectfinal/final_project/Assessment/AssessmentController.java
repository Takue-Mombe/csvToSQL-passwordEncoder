package org.projectfinal.final_project.Assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class AssessmentController {


    @Autowired
 private AssessmentService assessmentService;

    @PostMapping("/register")
    public String saveAssessement(@ModelAttribute AssessmentModel assessmentModel) {
        System.out.println(assessmentModel);
        assessmentService.saveAssessment(assessmentModel);
        return "<div>Submitted</div?";
    }
}
