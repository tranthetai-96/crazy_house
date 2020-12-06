package com.fpt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpt.Entity.EmployeeEntity;


@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	EmployeeEntity save(EmployeeEntity newEntity);
}
