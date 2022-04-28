package org.maxwell.ssm.controller;

import org.maxwell.ssm.entity.constant.ResponseStatus;
import org.maxwell.ssm.entity.response.ResponseResult;
import org.maxwell.ssm.entity.vo.Book;
import org.maxwell.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 21:40
 */
@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseResult save(@RequestBody Book book) {
        int result = bookService.save(book);
        return result > 0 ? ResponseResult.success() : ResponseResult.failed(ResponseStatus.SAVE_ERROR.getCode(), ResponseStatus.SAVE_ERROR.getMessage());
    }

    @PutMapping
    public ResponseResult update(@RequestBody Book book) {
        int result = bookService.update(book);
        return result > 0 ? ResponseResult.success() : ResponseResult.failed(ResponseStatus.UPDATE_ERROR.getCode(), ResponseStatus.UPDATE_ERROR.getMessage());
    }

    @DeleteMapping("/{id}")
    public ResponseResult delete(@PathVariable Integer id) {
        int result = bookService.delete(id);
        return result > 0 ? ResponseResult.success() : ResponseResult.failed(ResponseStatus.DELETE_ERROR.getCode(), ResponseStatus.DELETE_ERROR.getMessage());
    }


    @GetMapping("/{id}")
    public ResponseResult getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return book != null ? ResponseResult.success(book) : ResponseResult.failed(ResponseStatus.SELECT_ERROR.getCode(), ResponseStatus.SELECT_ERROR.getMessage());
    }

    @GetMapping
    public ResponseResult getAll() {
        List<Book> list = bookService.getAll();
        return list != null ? ResponseResult.success(list) : ResponseResult.failed(ResponseStatus.SELECT_ERROR.getCode(), ResponseStatus.SELECT_ERROR.getMessage());
    }

    @GetMapping(value = "/str",produces = "application/json;charset=utf-8")
    public Object str() {
        return "你好 MVC!";
    }

}
