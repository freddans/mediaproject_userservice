package com.freddan.mediaproject_userservice.controllers;

import com.freddan.mediaproject_userservice.entities.PlayedGenre;
import com.freddan.mediaproject_userservice.services.PlayedGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playedGenre")
public class PlayedGenreController {

    private PlayedGenreService playedGenreService;

    @Autowired
    public PlayedGenreController(PlayedGenreService playedGenreService) {
        this.playedGenreService = playedGenreService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PlayedGenre>> allPlayedGenres() {
        return ResponseEntity.ok(playedGenreService.allPlayedGenres());
    }

    @PostMapping("/create")
    public ResponseEntity<PlayedGenre> create(@RequestBody PlayedGenre playedGenre) {
        return ResponseEntity.ok(playedGenreService.create(playedGenre));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        return ResponseEntity.ok(playedGenreService.delete(id));
    }
}