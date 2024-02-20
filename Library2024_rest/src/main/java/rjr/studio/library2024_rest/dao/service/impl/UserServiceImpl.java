package rjr.studio.library2024_rest.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.library2024_rest.dao.entity.UserEntity;
import rjr.studio.library2024_rest.dao.repository.BaseRepository;

@Service
public class UserServiceImpl extends BaseCrudServiceImpl<UserEntity, Integer> {

	@Autowired
	UserServiceImpl(BaseRepository<UserEntity, Integer> repo) {
		super(repo);
	}

}
