package rjr.studio.library2024_rest.api.controller.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.library2024_rest.api.controller.BookController;
import rjr.studio.library2024_rest.api.view.ApiResponseBuilder;
import rjr.studio.library2024_rest.api.view.Body;
import rjr.studio.library2024_rest.dao.entity.BookEntity;
import rjr.studio.library2024_rest.dao.service.BaseCrudService;

@RestController
public class BookControllerImpl implements BookController {

	private BaseCrudService<BookEntity, Integer> bookService;

	@Autowired
	public BookControllerImpl(BaseCrudService<BookEntity, Integer> service) {
		this.bookService = service;
	}

	@Override
	public ResponseEntity<Body<BookEntity>> findAll() throws Exception {

		List<BookEntity> found = bookService.findAll();

		return ApiResponseBuilder.buildSuccessResponse(found, BookEntity._TYPE);
	}

	@Override
	public ResponseEntity<Body<BookEntity>> findById(Integer bookId) throws Exception {

		BookEntity found = bookService.findById(BookEntity.class, bookId);

		return ApiResponseBuilder.buildSuccessResponse(Arrays.asList(found), BookEntity._TYPE);
	}

	@Override
	public ResponseEntity<Body<Integer>> save(BookEntity book) throws Exception {

		Integer id = bookService.save(book).getId();

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
	public ResponseEntity<Body<Integer>> deleteById(Integer bookId) throws Exception {

		bookService.deleteById(BookEntity.class, bookId);

		Integer id = bookId;

		return ApiResponseBuilder.buildSuccessResponse(Arrays.asList(id), "Integer");
	}
}
