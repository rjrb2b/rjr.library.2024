package rjr.studio.library2024_rest.api.controller.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.library2024_rest.api.controller.UserController;
import rjr.studio.library2024_rest.api.view.ApiResponseBuilder;
import rjr.studio.library2024_rest.api.view.Body;
import rjr.studio.library2024_rest.dao.entity.UserEntity;
import rjr.studio.library2024_rest.dao.service.BaseCrudService;

@RestController
public class UserControllerImpl implements UserController {

	private BaseCrudService<UserEntity, Integer> userService;

	@Autowired
	public UserControllerImpl(BaseCrudService<UserEntity, Integer> service) {
		this.userService = service;
	}

	@Override
	public ResponseEntity<Body<UserEntity>> findAll() throws Exception {

		List<UserEntity> found = userService.findAll();

		return ApiResponseBuilder.buildSuccessResponse(found, UserEntity._TYPE);
	}

	@Override
	public ResponseEntity<Body<UserEntity>> findById(Integer userId) throws Exception {

		UserEntity found = userService.findById(UserEntity.class, userId);

		return ApiResponseBuilder.buildSuccessResponse(Arrays.asList(found), UserEntity._TYPE);
	}

	@Override
	public ResponseEntity<Body<Integer>> save(UserEntity user) throws Exception {

		Integer id = userService.save(user).getId();

		return ApiResponseBuilder.buildSuccessResponse(Arrays.asList(id), "Integer");
	}

//	@Override
//	public ResponseEntity<Body<Integer>> updateById(Integer bookId, Book book) throws Exception {
//
//		Integer id = bookBusiness.updateById(bookId, book);
//		
//		return ApiResponseBuilder.buildSuccessResponse(Arrays.asList(id), IntegerModel._TYPE);
//	}

	@Override
	public ResponseEntity<Body<Integer>> deleteById(Integer userId) throws Exception {

		userService.deleteById(UserEntity.class, userId);

		Integer id = userId;

		return ApiResponseBuilder.buildSuccessResponse(Arrays.asList(id), "Integer");
	}
}
