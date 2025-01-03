package com.study.work.EMS_Backend.repository;

import com.study.work.EMS_Backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
