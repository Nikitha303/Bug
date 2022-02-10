package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Bug;

public interface BugRepository extends CrudRepository<Bug , Integer>{

}
