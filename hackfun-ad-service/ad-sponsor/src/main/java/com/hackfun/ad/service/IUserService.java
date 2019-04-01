package com.hackfun.ad.service;

import com.hackfun.ad.exception.AdException;
import com.hackfun.ad.vo.CreateUserRequest;
import com.hackfun.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
