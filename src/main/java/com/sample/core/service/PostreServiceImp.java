package com.sample.core.service;

import java.util.List;

import com.sample.core.dao.PostreDao;
import com.sample.core.dao.PostreDaoImp;
import com.sample.core.domain.Postre;

public class PostreServiceImp implements PostreService{

	private PostreDao postreDao = new PostreDaoImp();
	public List<Postre> list() throws Exception {
		return postreDao.list();
	}

	
}
