package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Filters;
@Repository
public interface FilterRepo extends JpaRepository<Filters,Integer> {

}
