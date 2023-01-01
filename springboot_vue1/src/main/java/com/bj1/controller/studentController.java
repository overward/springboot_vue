package com.bj1.controller;

import com.bj1.pojo.student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/message/*")
@CrossOrigin(origins = "*")
public class studentController {
    @RequestMapping("get")
    public Object getStudent(){
        student s1=new student("张三",19,"北京");
        student s2=new student("李四",90,"上海");
        student s3=new student("王五",30,"广东");
        List<student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }
}
