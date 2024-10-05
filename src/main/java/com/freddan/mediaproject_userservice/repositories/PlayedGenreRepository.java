package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.entities.PlayedGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayedGenreRepository extends JpaRepository<PlayedGenre, Long> {
    PlayedGenre findPlayedGenreByGenreIgnoreCase(String genre);
}
