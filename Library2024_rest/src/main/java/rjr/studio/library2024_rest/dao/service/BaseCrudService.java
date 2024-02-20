package rjr.studio.library2024_rest.dao.service;

import java.io.Serializable;
import java.util.List;

import rjr.studio.library2024_rest.dao.entity.BaseEntity;

public interface BaseCrudService<E extends BaseEntity, ID extends Serializable> {

	List<E> findAll();

	E findById(Class<E> clazz, ID id);

	E save(E entity);

	void deleteById(Class<E> clazz, ID id);

}