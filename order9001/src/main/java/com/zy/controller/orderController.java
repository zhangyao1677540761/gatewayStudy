package com.zy.controller;

import com.zy.service.hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @学习小结
 */
@RestController
public class orderController {
    @Autowired
    hystrix hystrix;

    @GetMapping("/{id}")
    public String Message(@PathVariable("id") Integer id){
        String Mess = hystrix.getBook(id);
        return Mess;
    }

}