package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.EmployeeDTO;


@Repository
public interface Crud extends JpaRepository<EmployeeDTO,Integer>{

}
