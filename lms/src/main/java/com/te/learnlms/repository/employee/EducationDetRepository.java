package com.te.learnlms.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.learnlms.entity.EducationDetails;

@Repository
public interface EducationDetRepository extends JpaRepository<EducationDetails, Integer>{

}
