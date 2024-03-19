package org.projectfinal.final_project.Assessment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepo extends JpaRepository<AssessmentModel,Long> {
}
