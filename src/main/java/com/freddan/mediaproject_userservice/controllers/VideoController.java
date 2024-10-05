package com.freddan.mediaproject_userservice.controllers;

import com.freddan.mediaproject_userservice.services.UserService;
import com.freddan.mediaproject_userservice.services.VideoService;
import com.freddan.mediaproject_userservice.vo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/video")
public class VideoController {

    private VideoService videoService;
    private UserService userService;

    @Autowired
    public VideoController(VideoService videoService, UserService userService) {
        this.videoService = videoService;
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Video>> allVideos() {
        return ResponseEntity.ok(videoService.findAllVideos());
    }

    @GetMapping("/recommendations/{id}")
    public ResponseEntity<List<Video>> videoRecommendations(@PathVariable("id") long id) {
        return ResponseEntity.ok(userService.videoRecommendations(id));
    }

}
