package org.maxwell.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 15:50
 */
public interface OrderMapper {

    @Select("select 'order'")
    String getOrderName();

}
