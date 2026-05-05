package com.ruoyi.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.domain.TaskInfo;
import com.ruoyi.domain.TaskUser;
import com.ruoyi.service.TaskInfoService;
import com.ruoyi.service.TaskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/task") // 加上请求路径
public class TaskController {
    @Autowired
    private TaskUserService taskUserService;

    @Autowired
    private TaskInfoService taskInfoService;


    @Log(title = "用户注册", businessType = BusinessType.INSERT)
    @PostMapping("/register")
    public int registerUserName(@RequestBody TaskUser user) {
        int num = taskUserService.register(user);
        return num;
    }

    @Log(title = "用户登录", businessType = BusinessType.QUERY)
    @PostMapping("/login")
    public AjaxResult login(@RequestBody TaskUser user){
        AjaxResult name = taskUserService.login(user);
      return name;
    }

    @Log(title = "添加新任务", businessType = BusinessType.INSERT)
    @PostMapping("/add_task")
    public TaskInfo addTask(@RequestBody TaskInfo info){
        TaskInfo name = taskInfoService.addTask(info);
        return name;
    }

    @Log(title = "修改任务", businessType = BusinessType.INSERT)
    @PostMapping("/update_task")
    public String updateTask(@RequestBody TaskInfo info){
        String name = taskInfoService.updateTask(info);
        return name;
    }

    @Log(title = "删除任务", businessType = BusinessType.DELETE)
    @GetMapping("/delete_task/{taskId}")
    @ResponseBody
    public AjaxResult deleteTask(@PathVariable("taskId") Long taskId){
        AjaxResult name = taskInfoService.deleteTask(taskId);
        return name;
    }

    @Log(title = "查询所有任务", businessType = BusinessType.QUERY)
    @GetMapping("/show_task/{id}")
    @ResponseBody
    public List<TaskInfo> showTaskList(){
        PageUtils.startPage();
        List<TaskInfo>  tt =  taskInfoService.showTasks();
        return  tt;
    }




}
