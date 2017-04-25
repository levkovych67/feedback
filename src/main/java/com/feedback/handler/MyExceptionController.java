package com.feedback.handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyExceptionController {
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleError404()   {
        return "common/404";
    }
}