package com.movie.catalog.movieratingservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.catalog.movieratingservice.Entity.MoveRating;
import com.movie.catalog.movieratingservice.repository.MoveRatingRepository;
import com.movie.catalog.movieratingservice.service.MoveRatingService;

@Service
public class MoveRatingimpl implements MoveRatingService {

	@Autowired
	MoveRatingRepository repos;

	@Override
	public MoveRating getMoveRating(int moveinfo) {

		MoveRating rating = repos.findByCategory(moveinfo);
		return rating;
	}

	@Override
	public MoveRating addMoveRating(MoveRating moverating) {
		repos.save(moverating);
		return moverating;
	}

	@Override
	public MoveRating updateMoveRating(MoveRating moverating) {
		repos.save(moverating);
		return moverating;
	}

	@Override
	public MoveRating deleteMoveRating(MoveRating moverating) {
		repos.delete(moverating);
		return moverating;
	}

}
