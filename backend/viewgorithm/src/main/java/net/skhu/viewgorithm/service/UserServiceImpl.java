package net.skhu.viewgorithm.service;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import net.skhu.viewgorithm.mapper.UserSqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl {
    @Autowired
    private UserSqlMapper userSqlMapper;

    public void RegisterId(){
        userSqlMapper.RegisterId();
    }

}
