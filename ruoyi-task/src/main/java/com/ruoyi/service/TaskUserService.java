package com.ruoyi.service;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.domain.TaskUser;

import java.util.List;

public interface TaskUserService {

    public int register(TaskUser taskuser);

    public int yzUser(TaskUser taskuser);

    public AjaxResult login(TaskUser taskuser);

    public TaskUser addTask(TaskUser taskuser);

}
