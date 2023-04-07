package com.ps.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.demo.dto.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
