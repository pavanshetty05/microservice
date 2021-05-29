package com.movie.catalog.movieratingservice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class MoveRating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int moveRatingID;
	@Column(name = "MoveID")
	private int MoveID;
	@Column(name = "moveRating")
	private String moveRating;

	public int getMoveRatingID() {
		return moveRatingID;
	}

	public void setMoveRatingID(int moveRatingID) {
		this.moveRatingID = moveRatingID;
	}

	public int getMoveID() {
		return MoveID;
	}

	public void setMoveID(int moveID) {
		MoveID = moveID;
	}

	public String getMoveRating() {
		return moveRating;
	}

	public void setMoveRating(String moveRating) {
		this.moveRating = moveRating;
	}

}
