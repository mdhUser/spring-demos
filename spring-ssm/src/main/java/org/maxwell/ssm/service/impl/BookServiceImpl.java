package org.maxwell.ssm.service.impl;

import org.maxwell.ssm.entity.constant.ResponseStatus;
import org.maxwell.ssm.entity.vo.Book;
import org.maxwell.ssm.error.BusinessException;
import org.maxwell.ssm.mapper.BookMapper;
import org.maxwell.ssm.service.BookService;
import org.maxwell.ssm.utils.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 22:07
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    @Transactional(rollbackFor = BusinessException.class)
    public int save(Book book) {
        return bookMapper.save(book);
    }

    @Override
    @Transactional(rollbackFor = BusinessException.class)
    public int update(Book book) {
        int update = bookMapper.update(book);
        AssertUtil.isTrue(update <= 0).throwMessage(ResponseStatus.UPDATE_ERROR.getCode(), ResponseStatus.UPDATE_ERROR.getMessage());
        return update;
    }

    @Override
    @Transactional(rollbackFor = BusinessException.class)
    public int delete(Integer id) {
        return bookMapper.delete(id);
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

}
