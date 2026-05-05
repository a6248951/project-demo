package com.ruoyi.service.impl;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.domain.TaskInfo;
import com.ruoyi.mapper.TaskInfoMapper;
import com.ruoyi.service.TaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskInfoServiceImpl implements TaskInfoService {
    @Autowired
    private TaskInfoMapper taskInfoMapper;

    public TaskInfo addTask(TaskInfo info) {
        int infoList = taskInfoMapper.insertTaskInfo(info);
        if (infoList > 0) {
            return info;
        } else {
            return null;
        }
    }

    public String updateTask(TaskInfo info){
        int infoList = taskInfoMapper.updateOneTaskInfo(info);
        if(infoList > 0 ){
            String message = "修改成功";
            return message;
        }else{
            String message = "修改失败";
            return message;
        }
    }

    public AjaxResult deleteTask(Long taskId){
        int infoList = taskInfoMapper.deleteOneTaskInfo(taskId);
        if(infoList >0){
            return AjaxResult.warn("删除成功");
        }else{
            return AjaxResult.warn("删除失败");
        }
    }

    public List<TaskInfo> showTasks(){

        List<TaskInfo> infos  = taskInfoMapper.selectAllTaskInfo(new TaskInfo());
        return infos;
    }



}
