package com.ruoyi.service.impl;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.domain.TaskUser;
import com.ruoyi.mapper.TaskUserMapper;
import com.ruoyi.service.TaskUserService;
//import io.lettuce.core.support.caching.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

@Service
public class TaskUserServiceImpl implements TaskUserService {
    @Autowired
    private TaskUserMapper taskUserMapper;

    public int register(TaskUser taskuser) {
        System.out.println("前端传过来的用户名-----------：" + taskuser.getUsername());
        int test = taskUserMapper.insertUserInfo(taskuser);
        return test;
    }

    public AjaxResult login(TaskUser taskuser) {
        System.out.println("前端传过来的用户名-----------：" + yzUser(taskuser));
        if (yzUser(taskuser) <= 0) {
            return AjaxResult.error("用户名或密码错误");
        }
        // 生成唯一token
        String token = IdUtils.fastUUID();
        // 返回token给前端
        return AjaxResult.success("登录成功").put("token", token);
    }

    public int yzUser(TaskUser taskuser) {
        int data = taskUserMapper.selectOneUserid(taskuser);
        return data;
    }

    public TaskUser addTask(TaskUser taskuser){
       int test = taskUserMapper.insertUserInfo(taskuser);
       if(test > 0 ){
           return taskuser;
       }else{
           return null;
       }
    }

}
