package edu.miu.cs.cs425.eregistrar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @NotBlank(message = "* student number can not be blank")
    @Column(nullable = false) // studentNumber is required
    private String studentNumber;


    @NotBlank(message = "student number can not be blank, empty or null") // this will handle NotNull and NotEmpty / applies for string
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @NotBlank
    @Column(nullable = false) // studentNumber is required
    private String lastName;

    private Double cgpa;

    @NotNull(message = "enrollmentDate  cannot be null")
    @Column(nullable = false)
    private LocalDate enrollmentDate;
    @NotBlank(message = "is international  cannot be blank")
    @Column(nullable = false)
    private String isInternational;
}
