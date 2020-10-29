package com.brief.challenge.controller;

import static com.brief.challenge.constant.Routes.ERROR;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController  {
 
    @RequestMapping(ERROR)
    public String handleError() {
        return "Not here dude :)";
    }
 
    @Override
    public String getErrorPath() {
        return null;
    }
}