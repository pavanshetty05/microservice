package com.movie.catalog.movieinfoservice.Respository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.catalog.movieinfoservice.Entity.Moveinfo;

@Repository
public interface MoveInfoRespository extends CrudRepository<Moveinfo, Integer>{

	@Query("FROM Moveinfo WHERE moveID=:moveID")
	public Moveinfo findByCategory(@Param("moveID") Integer moveID);
}
