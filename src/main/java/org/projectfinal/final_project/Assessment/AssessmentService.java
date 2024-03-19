package org.projectfinal.final_project.Assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class AssessmentService {


  @Autowired
  private final AssessmentRepo assessmentRepo;

    public AssessmentService(AssessmentRepo assessmentRepo) {
        this.assessmentRepo = assessmentRepo;
    }

    public AssessmentModel saveAssessment(AssessmentModel assessmentModel){

        return  assessmentRepo.save(assessmentModel);

  }
}
