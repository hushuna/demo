package com.example.service;

import com.example.dao.UserDao;
import com.example.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: hsn
 * @description:
 * @date: 2019/9/12 10:32
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserVO getUserDao() {
        return userDao.getUser();
    }
}
