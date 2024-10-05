package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.vo.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    Genre findGenreByGenreIgnoreCase(String genre);
}