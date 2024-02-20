package rjr.studio.library2024_rest.dao.repository;

import org.springframework.stereotype.Repository;

import rjr.studio.library2024_rest.dao.entity.UserEntity;

@Repository
public interface UserRepository extends BaseRepository<UserEntity, Integer> {

}
