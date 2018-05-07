package com.crm.mydemo.mapper;

import com.crm.mydemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    @Select("select * from user where id = #{userId}")
    User findUserByUserid(@Param("userId") String userId);

}
