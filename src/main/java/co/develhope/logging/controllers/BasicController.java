package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController{

    @Autowired
    BasicService basicService;


    @GetMapping("/")
    public String welcome(){
        return basicService.welcome();
    }

    @GetMapping("/exp")
    public String potenza(){
        return basicService.potenza();
    }

    @GetMapping("/errors")
    public void errors() {
        basicService.errors();
    }








}