package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.vo.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

    Optional<Video> findByUrlIgnoreCase(String url);
    boolean existsByUrlIgnoreCase(String url);
}
