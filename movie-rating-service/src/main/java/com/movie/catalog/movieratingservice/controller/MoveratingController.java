package com.movie.catalog.movieratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.catalog.movieratingservice.Entity.MoveRating;
import com.movie.catalog.movieratingservice.service.MoveRatingService;

@RestController
@RequestMapping(value = "/rating")
public class MoveratingController {

	@Autowired
	MoveRatingService oMoveRatingservice;

	@RequestMapping(value = "/moverating/{id}", method = RequestMethod.GET)
	public MoveRating getMoveRating(@PathVariable("id") int moveRating) {
		MoveRating oMoveRating = oMoveRatingservice.getMoveRating(moveRating);
		return oMoveRating;

	}

	@RequestMapping(value = "/moverating", method = RequestMethod.POST)
	public MoveRating addMoveRating(@RequestBody MoveRating oMoveRating) {
		oMoveRatingservice.addMoveRating(oMoveRating);
		return oMoveRating;

	}

	@RequestMapping(value = "/moverating", method = RequestMethod.PUT)
	public MoveRating updateMoveRating(@RequestBody MoveRating oMoveRating) {
		oMoveRatingservice.updateMoveRating(oMoveRating);
		return oMoveRating;

	}

	@RequestMapping(value = "/moverating", method = RequestMethod.DELETE)
	public MoveRating deleteMoveRating(@RequestBody MoveRating oMoveRating) {
		oMoveRatingservice.deleteMoveRating(oMoveRating);
		return oMoveRating;

	}
}
