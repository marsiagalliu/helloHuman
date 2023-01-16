package com.dojo.hellohuman.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @RequestMapping("/")
    public String hello(@RequestParam(value= "name", required = false) String searchQuery, @RequestParam(value = "lastname") String searchQuery1){
        if (searchQuery == null){
            return "Hello Human";
        }
        return "Hello " + searchQuery + " " + searchQuery1;
    }
}
