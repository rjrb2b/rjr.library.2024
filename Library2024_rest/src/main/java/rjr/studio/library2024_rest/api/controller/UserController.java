package rjr.studio.library2024_rest.api.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import rjr.studio.library2024_rest.api.view.Body;
import rjr.studio.library2024_rest.dao.entity.UserEntity;

@RequestMapping(value = "")
public interface UserController {

	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds all users", description = "description ...")
	ResponseEntity<Body<UserEntity>> findAll() throws Exception;

	@GetMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds user by id", description = "description ...")
	ResponseEntity<Body<UserEntity>> findById(
			@Parameter(in = ParameterIn.PATH, description = "ID of user to return", required = true) @PathVariable Integer userId)
			throws Exception;

	@PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Create new user", description = "description ...")
	ResponseEntity<Body<Integer>> save(
			@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Entity of user to create", required = true) @RequestBody UserEntity user)
			throws Exception;

//	@PutMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	@Operation(summary = "Update user by id", description = "description ...")
//	ResponseEntity<Body<Integer>> updateById(
//			@Parameter(in = ParameterIn.PATH, description = "ID of user to update", required = true) @PathVariable Integer userId,
//			@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Entity of user to update", required = true) @RequestBody Book user)
//			throws Exception;

	@DeleteMapping(value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Delete user by id", description = "description ...")
	ResponseEntity<Body<Integer>> deleteById(
			@Parameter(in = ParameterIn.PATH, description = "ID of user to delete", required = true) @PathVariable Integer userId)
			throws Exception;

}
