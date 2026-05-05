package com.ruoyi.domain;

public class TaskFile {

    private Long id;
    private Long taskId;
    private String fileName;
    private String filePath;
    private Long fileSize;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return  id;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getFileSize() {
        return fileSize;
    }
}
