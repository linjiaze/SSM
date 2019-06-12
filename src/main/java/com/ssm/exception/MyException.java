package com.ssm.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 异常处理
 *
 * @author lin
 */
@ControllerAdvice
public class MyException {

    @ExceptionHandler(Exception.class)
    public String exception(Exception e) {
        System.out.println(e.getMessage());
        return "error";
    }
}
