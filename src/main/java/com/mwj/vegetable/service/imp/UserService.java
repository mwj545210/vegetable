package com.mwj.vegetable.service.imp;

import com.mwj.vegetable.dao.UserDao;
import com.mwj.vegetable.entry.User;
import com.mwj.vegetable.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MWJ on 2017/12/25.
 */
@Service
public class UserService implements IUserService{

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public User login(String userName, String password) {
        User user = userDao.findByUserNameAndPassword(userName, password);
        return user;
    }
}
