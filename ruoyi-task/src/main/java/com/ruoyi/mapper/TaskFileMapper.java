package com.ruoyi.mapper;

import com.ruoyi.domain.TaskFile;
import com.ruoyi.domain.TaskInfo;

import java.util.List;

public interface TaskFileMapper {

    //查询所有的数据
    List<TaskFile> selectTaskFileList(TaskFile taskFile);

    //查询
    TaskFile selectTaskFileById(Long id);

    //增加
    int insertTaskFile(TaskFile taskFile);

    //修改
    int updateTaskFile(TaskFile taskFile);

    //删除
    int deleteTaskFile(Long id);


}
