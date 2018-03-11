package com.mwj.vegetable.service;

import com.mwj.vegetable.entry.User;

import java.util.List;

/**
 * Created by MWJ on 2017/12/25.
 */
public interface IUserService {
    List<User> findAllUser();

    User login(String userName, String password);
}
