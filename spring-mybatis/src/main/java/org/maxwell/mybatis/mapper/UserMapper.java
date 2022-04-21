package org.maxwell.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @description: 接口无法生成bean
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 23:56
 */

public interface UserMapper {


    @Select("select 'user'")
    String getUserName();

}
