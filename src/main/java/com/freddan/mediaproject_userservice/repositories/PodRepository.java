package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.vo.Genre;
import com.freddan.mediaproject_userservice.vo.Pod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PodRepository extends JpaRepository<Pod, Long> {
    Optional<Pod> findByUrlIgnoreCase(String url);
    boolean existsByUrlIgnoreCase(String url);

    List<Pod> findPodsByGenres(Genre genre);
}