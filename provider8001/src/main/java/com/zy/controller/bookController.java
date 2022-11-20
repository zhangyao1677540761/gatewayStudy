package com.zy.controller;

import com.zy.pojo.BsBook;
import com.zy.mapper.BsBookMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @学习小结
 */
@RestController
public class bookController {
    @Resource
    BsBookMapper BsBookMapper;

    @GetMapping("/{id}")
    public BsBook getBook(@PathVariable("id") Integer id){
        return BsBookMapper.selectById(id);
    }

}
