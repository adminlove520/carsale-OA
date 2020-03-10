package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Employee;

/**
 * @author gxyan
 * @date 2020/2/12 9:53
 */
public interface IUserService {

    ServerResponse<Employee> login(Integer userId, String password);
}
