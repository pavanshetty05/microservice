package com.movie.catalog.movieinfoservice.service;

import org.springframework.stereotype.Service;

import com.movie.catalog.movieinfoservice.Entity.Moveinfo;

@Service
public interface MovieInfoService {
	public Moveinfo getMoveInfo(int moveinfo);
	public Moveinfo addMoveInfo(Moveinfo moveinfo);
	public Moveinfo updateMoveInfo(Moveinfo moveinfo) ;
	public Moveinfo deleteMoveInfo(Moveinfo moveinfo);
}
