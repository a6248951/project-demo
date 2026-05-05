package com.ruoyi.domain;

import java.util.Date;

public class TaskUser {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date create_time;

    public void setId(Long Id)
    {
        this.id = Id;
    }

    public Long getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return  username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setPhone(String phone){
        this.phone =phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getCreate_time() {
        return create_time;
    }
}
