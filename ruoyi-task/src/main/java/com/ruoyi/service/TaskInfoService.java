package com.ruoyi.service;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.domain.TaskInfo;

import java.util.List;

public interface TaskInfoService {

    public TaskInfo addTask(TaskInfo taskInfo);

    public String updateTask(TaskInfo taskInfo);

    public AjaxResult deleteTask(Long taskId);

    public List<TaskInfo> showTasks();

}
