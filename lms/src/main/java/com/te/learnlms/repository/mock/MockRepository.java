package com.te.learnlms.repository.mock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.learnlms.entity.Mocks;

@Repository
public interface MockRepository extends JpaRepository<Mocks, Integer>{

}
