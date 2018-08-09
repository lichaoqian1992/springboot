package com.forezep.springcache.dao;

import com.forezep.springcache.entity.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
