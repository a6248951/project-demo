package com.ruoyi.mapper;

import com.ruoyi.domain.TaskInfo;

import java.util.List;

public interface TaskInfoMapper {

    //批量查询
    List<TaskInfo> selectAllTaskInfo(TaskInfo taskInfo);

    //查询
    TaskInfo selectOneTaskInfo(Long id);

    //修改
    int  updateOneTaskInfo(TaskInfo taskInfo);

    //删除
    int deleteOneTaskInfo(Long id);

    //增加
    int insertTaskInfo(TaskInfo taskInfo);

}
