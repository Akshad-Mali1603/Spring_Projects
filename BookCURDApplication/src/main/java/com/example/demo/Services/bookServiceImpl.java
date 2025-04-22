package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.bookRepository;

@Service
public class bookServiceImpl implements bookServices {

	@Autowired
	private bookRepository bs;
	
	@Override
	public void add(Book b) {
	bs.save(b);
	System.out.println("Record Save Successfully !!");
	}

	@Override
	public List<Book> display() {
		
		return bs.findAll();
	}

	@Override
	public void delete(Integer id) {
		bs.deleteById(id);
		
	}

	@Override
	public void updatebook(Book b, Integer id) {
		
		b.setId(id);
		bs.save(b);
	}

	@Override
	public List<Book> search(String authername) {
		
		var bookarray= new ArrayList<Book>();
		for (Book book : bs.findAll()) {
			
			if (book.getAuthorName().equalsIgnoreCase(authername)) {
				
				bookarray.add(book);	
			}
		}
		return bookarray;
	}

}
