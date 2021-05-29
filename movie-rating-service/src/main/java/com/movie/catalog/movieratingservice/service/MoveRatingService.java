package com.movie.catalog.movieratingservice.service;

import org.springframework.stereotype.Service;

import com.movie.catalog.movieratingservice.Entity.MoveRating;

@Service
public interface MoveRatingService {

	public MoveRating getMoveRating(int moveinfo);
	public MoveRating addMoveRating(MoveRating moverating);
	public MoveRating updateMoveRating(MoveRating moverating) ;
	public MoveRating deleteMoveRating(MoveRating moverating);
}
