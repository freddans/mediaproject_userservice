package com.freddan.mediaproject_userservice.controllers;

import com.freddan.mediaproject_userservice.services.PodService;
import com.freddan.mediaproject_userservice.services.UserService;
import com.freddan.mediaproject_userservice.vo.Pod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/pod")
public class PodController {

    private PodService podService;
    private UserService userService;

    @Autowired
    public PodController(PodService podService, UserService userService) {
        this.podService = podService;
        this.userService = userService;
    }

    @GetMapping("/all")
    ResponseEntity<List<Pod>> allPods() {
        return ResponseEntity.ok(podService.findAllPods());
    }

    @GetMapping("/recommendations/{id}")
    public ResponseEntity<List<Pod>> podRecommendations(@PathVariable("id") long id) {
        return ResponseEntity.ok(userService.podRecommendations(id));
    }
}
