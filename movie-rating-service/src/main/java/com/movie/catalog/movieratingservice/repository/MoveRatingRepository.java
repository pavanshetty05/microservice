package com.movie.catalog.movieratingservice.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.catalog.movieratingservice.Entity.MoveRating;

@Repository
public interface MoveRatingRepository extends CrudRepository<MoveRating, Integer> {

	@Query("FROM MoveRating WHERE MoveID=:MoveID")
	public MoveRating findByCategory(@Param("MoveID") Integer MoveID);

}
