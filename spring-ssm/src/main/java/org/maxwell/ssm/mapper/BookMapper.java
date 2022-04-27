package org.maxwell.ssm.mapper;

import org.apache.ibatis.annotations.*;
import org.maxwell.ssm.entity.vo.Book;
import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 22:32
 */
@Mapper
public interface BookMapper {

    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    int save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();


}
