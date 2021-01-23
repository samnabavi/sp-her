package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Task;

@Repository
public interface TskRepository extends JpaRepository<Task, Long>{

}