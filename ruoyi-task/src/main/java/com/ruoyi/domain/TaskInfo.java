package com.ruoyi.domain;
import java.util.Date;

public class TaskInfo {

    private Long id;
    private Long userId;
    private String title;
    private String content;
    private Long priority;
    private Long status;
    private Date deadline;
    private Date createTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return  id;
    }

    public void setUserId(Long userId)
    {
       this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setPriority(Long priority)
    {
        this.priority = priority;
    }

    public Long getPriority()
    {
        return priority;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
