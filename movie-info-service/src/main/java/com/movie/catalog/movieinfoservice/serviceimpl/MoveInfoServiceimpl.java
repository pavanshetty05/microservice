package com.movie.catalog.movieinfoservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.catalog.movieinfoservice.Entity.Moveinfo;
import com.movie.catalog.movieinfoservice.Respository.MoveInfoRespository;
import com.movie.catalog.movieinfoservice.service.MovieInfoService;

@Service
public class MoveInfoServiceimpl implements MovieInfoService {

	@Autowired
	MoveInfoRespository moverepo;

	@Override
	public Moveinfo getMoveInfo(int moveinfoID) {
		Moveinfo moveinfo = moverepo.findByCategory(moveinfoID);
		return moveinfo;
	}
	@Override
	public Moveinfo addMoveInfo(Moveinfo moveinfo) {
		Moveinfo oinfo = moverepo.save(moveinfo);
		return oinfo;
	}

	@Override
	public Moveinfo updateMoveInfo(Moveinfo moveinfo) {
		Moveinfo oinfo = moverepo.save(moveinfo);
		return oinfo;
	}

	@Override
	public Moveinfo deleteMoveInfo(Moveinfo moveinfo) {
		moverepo.delete(moveinfo);
		return moveinfo;
	}

}
