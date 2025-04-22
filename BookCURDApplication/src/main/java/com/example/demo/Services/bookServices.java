package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.Book;

public interface bookServices {
	public void add(Book b);
	public List<Book> display();
	public void delete(Integer id);
	public void updatebook(Book b,Integer id);
	public List<Book> search(String authername);

}
