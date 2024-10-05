package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.vo.Genre;
import com.freddan.mediaproject_userservice.vo.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
    Optional<Music> findByUrlIgnoreCase(String url);
    boolean existsByUrlIgnoreCase(String url);

    List<Music> findMusicByGenres(Genre genre);
}