package org.maxwell.ssm.service;

import org.maxwell.ssm.entity.vo.Book;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 22:06
 */
public interface BookService {


    int save(Book book);

    int update(Book book);

    int delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();
}
