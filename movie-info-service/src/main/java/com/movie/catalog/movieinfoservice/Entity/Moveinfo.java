package com.movie.catalog.movieinfoservice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Moveinfo")
public class Moveinfo {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int moveinfoSeq;
	@Column(name="moveID")
	private int moveID;
	@Column(name="moveInfo")
	private String moveInfo;
	
	
	public int getMoveinfoSeq() {
		return moveinfoSeq;
	}
	public void setMoveinfoSeq(int moveinfoSeq) {
		this.moveinfoSeq = moveinfoSeq;
	}
	public int getMoveID() {
		return moveID;
	}
	public void setMoveID(int moveID) {
		this.moveID = moveID;
	}
	public String getMoveInfo() {
		return moveInfo;
	}
	public void setMoveInfo(String moveInfo) {
		this.moveInfo = moveInfo;
	}
	
	
}
