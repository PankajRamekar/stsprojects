package com.te.learnlms.repository.mentor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.learnlms.entity.Mentor;
@Repository
public interface MentorRepository extends JpaRepository<Mentor,String>{

}
