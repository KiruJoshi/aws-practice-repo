package com.aws.cicd.awscicdproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
   @GetMapping("/getMessage")
    public String getMessage()
   {
        return " Hi this is my first web application deployed in aws";
    }
   
    @GetMapping("/getDetails")
    public String getMessageNew(){
        return " Good afterNoon from Kiran";
    }
}
