package org.projectfinal.final_project.Assessment;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "AssessmentModel")
public class AssessmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or appropriate strategy
    @Column(name = "id")
   private Long id;
    private String assessmentType;
    @Column
    private double courseWeight;
    @Column
    private double currentTotal;
    @Column
    private double total;

}
