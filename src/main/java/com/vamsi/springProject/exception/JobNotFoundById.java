package com.vamsi.springProject.exception;

public class JobNotFoundById extends RuntimeException{
    public JobNotFoundById(String msg)
    {
        super(msg);
    }
}
