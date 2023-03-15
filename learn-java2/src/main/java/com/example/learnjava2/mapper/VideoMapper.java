package com.example.learnjava2.mapper;

import com.example.learnjava2.domain.Video;

import java.util.HashMap;
import java.util.Map;

public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1, new Video(1, "demo1"));
        videoMap.put(2, new Video(2, "demo2"));
        videoMap.put(3, new Video(3, "demo3"));
        videoMap.put(4, new Video(4, "demo4"));
    }


}
