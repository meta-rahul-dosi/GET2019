package com.metacube.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.metacube.rest.dao.BookDao;
import com.metacube.rest.model.BookModel;

@RestController
public class BookController {

	@GetMapping("/showAllBooks")
	public ModelAndView getBookByTitle() {

		List<String> listOfBooks = BookDao.fetchAllBooks();

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listOfBooks", listOfBooks);
		modelAndView.setViewName("showAllBooks.jsp");
		return modelAndView;
	}

	@GetMapping("/fetchBookById/{bookId}")
	public ModelAndView fetchBookById(@PathVariable int bookId) {

		String book = BookDao.fetchBookById(bookId);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("book", book);
		modelAndView.setViewName("fetchBookById.jsp");
		return modelAndView;
	}

	@PostMapping(value = "/insertBook", consumes = "application/json", produces = "application/json")
	public String insertBook(@RequestBody BookModel model) {
		System.out.println(model.getTitle());
		return BookDao.insertBook(model.getTitle(), model.getWriter(), model.getPublisher(), model.getPublishedYear());
	}

	@DeleteMapping("/deleteBookById/{bookId}")
	public void deleteBookById(@RequestParam int bookId) {
		BookDao.deleteBookById(bookId);
	}

	@DeleteMapping(value = "/deleteAllBooks")
	public void deleteAllBooks() {
		BookDao.deleteAllBooks();
	}

}
