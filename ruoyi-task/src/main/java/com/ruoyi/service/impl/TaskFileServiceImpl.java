package com.ruoyi.service.impl;

import com.ruoyi.domain.TaskFile;
import com.ruoyi.mapper.TaskFileMapper;
import com.ruoyi.service.TaskFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskFileServiceImpl implements TaskFileService {

    @Autowired
    private TaskFileMapper taskFileMapper;
    public List<TaskFile> selectTaskFileListTest(TaskFile taskFile){
        List<TaskFile> retConfig = taskFileMapper.selectTaskFileList(taskFile);
        return retConfig;
    }




}
