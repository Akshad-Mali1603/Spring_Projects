package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Services.bookServices;


@RestController
public class bookController {

	@Autowired
	private bookServices bs;
	
	@PostMapping("/add")
	public void add(@RequestBody Book book) {
		
		bs.add(book);
		
	}
	
	@GetMapping("/Display")
	public List<Book> display(){
		return bs.display();
	}
	
	@DeleteMapping("/DeleteRecord/{id}")
	public void delete(@PathVariable Integer id) {
		bs.delete(id);
	}
	
	@PutMapping("/Update/{id}")
	public void updatebook(@RequestBody Book book, @PathVariable Integer id) {
		bs.updatebook(book, id);
	}
	
	@GetMapping("/Search/{authorName}")
	public List<Book> search(@PathVariable String authorName){
		return bs.search(authorName);
	}
}
