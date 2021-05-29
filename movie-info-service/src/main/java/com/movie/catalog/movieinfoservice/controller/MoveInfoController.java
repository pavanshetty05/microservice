package com.movie.catalog.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.catalog.movieinfoservice.Entity.Moveinfo;
import com.movie.catalog.movieinfoservice.service.MovieInfoService;

@RestController
@RequestMapping(value = "/info")
public class MoveInfoController {

	@Autowired
	MovieInfoService omoveinfoService;

	@RequestMapping(value = "/moveinfoid/{id}", method = RequestMethod.GET)
	public Moveinfo getMoveInfo(@PathVariable("id") int moveinfo) {
		Moveinfo omoveInfo = omoveinfoService.getMoveInfo(moveinfo);
		return omoveInfo;

	}

	@RequestMapping(value = "/moveinfo", method = RequestMethod.POST)
	public Moveinfo addMoveInfo(@RequestBody Moveinfo moveinfo) {
		Moveinfo omoveInfo = omoveinfoService.addMoveInfo(moveinfo);
		return omoveInfo;

	}

	@RequestMapping(value = "/moveinfo", method = RequestMethod.PUT)
	public Moveinfo updateMoveInfo(@RequestBody Moveinfo moveinfo) {
		Moveinfo omoveInfo = omoveinfoService.updateMoveInfo(moveinfo);
		return omoveInfo;

	}

	@RequestMapping(value = "/moveinfo", method = RequestMethod.DELETE)
	public Moveinfo deleteMoveInfo(@RequestBody Moveinfo moveinfo) {
		Moveinfo omoveInfo = omoveinfoService.deleteMoveInfo(moveinfo);
		return omoveInfo;

	}

}
