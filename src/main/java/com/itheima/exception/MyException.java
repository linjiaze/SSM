package com.itheima.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyException {

    @ExceptionHandler(Exception.class)
    public String exception(Exception e){
        System.out.println(e.getMessage());
        return "error";
    }
}
