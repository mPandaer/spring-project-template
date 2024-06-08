package com.pandaer.server.modules.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pandaer.server.modules.user.entity.User;
import com.pandaer.server.modules.user.service.UserService;
import com.pandaer.server.modules.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author pandaer
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2024-06-08 18:48:42
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




