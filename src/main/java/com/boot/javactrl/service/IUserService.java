package com.boot.javactrl.service;

import com.boot.javactrl.controller.dto.UserDTO;
import com.boot.javactrl.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张预阅
 * @since 2022-10-12
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);
}
