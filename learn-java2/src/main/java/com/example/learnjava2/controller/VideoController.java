package com.example.learnjava2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 视频控制器
 */

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

//    @RequestMapping("list")
    @GetMapping("list")
    public Object list() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "课程");
        map.put("2", "微服务课程");

        return map;
    }
}
