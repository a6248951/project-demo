package com.ruoyi.mapper;

import com.ruoyi.domain.TaskUser;

import java.util.List;

public interface TaskUserMapper {

    //批量查询
    TaskUser selectAllUserInfo(TaskUser taskuser);

    //查询
    TaskUser selectOneUserInfo(Long id);

    //修改
    int updateOneUserInfo(Long id);

    //插入
    int insertUserInfo(TaskUser taskuser);

    //删除
    int deleteUserInfo(Long id);

    int  selectOneUserid(TaskUser taskuser);




}
