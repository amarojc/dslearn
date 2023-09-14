package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.Enrollment;
import com.amarojc.dslearn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{

}
