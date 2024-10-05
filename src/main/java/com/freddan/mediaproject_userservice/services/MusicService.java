package com.freddan.mediaproject_userservice.services;

import com.freddan.mediaproject_userservice.repositories.MusicRepository;
import com.freddan.mediaproject_userservice.vo.Genre;
import com.freddan.mediaproject_userservice.vo.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class MusicService {

    private MusicRepository musicRepository;

    @Autowired
    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public List<Music> findAllMusic() {
        return musicRepository.findAll();
    }

    public boolean musicExistsByUrl(String url) {
        return musicRepository.existsByUrlIgnoreCase(url);
    }

    public Music findMusicByUrl(String url) {
        Optional<Music> optionalMusic = musicRepository.findByUrlIgnoreCase(url);

        if (optionalMusic.isPresent()) {
            return optionalMusic.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ERROR: Could not be found");
        }
    }

    public List<Music> findAllMusicInGenre(Genre genre) {
        return musicRepository.findMusicByGenres(genre);
    }

    public Music addPlay(Music music) {
        music.countPlay();
        musicRepository.save(music);

        return music;
    }
}
