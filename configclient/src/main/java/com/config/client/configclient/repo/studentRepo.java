package com.config.client.configclient.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.config.client.configclient.entity.Student;


public interface studentRepo extends CrudRepository<Student, Integer>  {

}
