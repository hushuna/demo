package com.example.dao;

import com.example.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: hsn
 * @description:
 * @date: 2019/9/12 10:07
 **/
@Mapper
public interface UserDao {

    UserVO getUser();
}
