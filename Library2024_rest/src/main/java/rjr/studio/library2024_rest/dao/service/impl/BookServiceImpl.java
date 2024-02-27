package rjr.studio.library2024_rest.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.library2024_rest.dao.entity.BookEntity;
import rjr.studio.library2024_rest.dao.repository.BaseRepository;

@Service
public class BookServiceImpl extends BaseCrudServiceImpl<BookEntity, Integer> {

	@Autowired
	BookServiceImpl(BaseRepository<BookEntity, Integer> repo) {
		super(repo);
	}

}
