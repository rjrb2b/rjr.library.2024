package rjr.studio.library2024_rest.dao.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import rjr.studio.library2024_rest.dao.entity.BaseEntity;
import rjr.studio.library2024_rest.dao.repository.BaseRepository;
import rjr.studio.library2024_rest.dao.service.BaseCrudService;

public abstract class BaseCrudServiceImpl<E extends BaseEntity, ID extends Serializable>
		implements BaseCrudService<E, ID> {

	private BaseRepository<E, ID> repo;

	@Autowired
	BaseCrudServiceImpl(BaseRepository<E, ID> repo) {
		this.repo = repo;
	}

	@Override
	public List<E> findAll() {
		return repo.findAll();
	}

	@Override
	public E findById(Class<E> clazz, ID id) {
		return repo.findById(id).orElseThrow(
				() -> new EntityNotFoundException(clazz.getSimpleName() + " ID " + id.toString() + " not found"));
	}

	@Override
	public E save(E entity) {
		return repo.save(entity);
	}

	@Override
	public void deleteById(Class<E> clazz, ID id) {
		this.findById(clazz, id);
		repo.deleteById(id);
	}

}
