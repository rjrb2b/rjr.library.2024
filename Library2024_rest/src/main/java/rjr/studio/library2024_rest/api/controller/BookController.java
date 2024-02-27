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
import rjr.studio.library2024_rest.dao.entity.BookEntity;

@RequestMapping(value = "")
public interface BookController {

	@GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds all books", description = "description ...")
	ResponseEntity<Body<BookEntity>> findAll() throws Exception;

	@GetMapping(value = "/book/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds book by id", description = "description ...")
	ResponseEntity<Body<BookEntity>> findById(
			@Parameter(in = ParameterIn.PATH, description = "ID of book to return", required = true) @PathVariable Integer bookId)
			throws Exception;

	@PostMapping(value = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Create new book", description = "description ...")
	ResponseEntity<Body<Integer>> save(
			@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Entity of book to create", required = true) @RequestBody BookEntity book)
			throws Exception;

//	@PutMapping(value = "/book/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	@Operation(summary = "Update book by id", description = "description ...")
//	ResponseEntity<Body<Integer>> updateById(
//			@Parameter(in = ParameterIn.PATH, description = "ID of book to update", required = true) @PathVariable Integer bookId,
//			@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Entity of book to update", required = true) @RequestBody Book book)
//			throws Exception;

	@DeleteMapping(value = "/book/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Delete book by id", description = "description ...")
	ResponseEntity<Body<Integer>> deleteById(
			@Parameter(in = ParameterIn.PATH, description = "ID of book to delete", required = true) @PathVariable Integer bookId)
			throws Exception;

}
