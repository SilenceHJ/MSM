package com.hj.dao;

import com.hj.entity.Book;

public interface BookDao {

    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);

}
