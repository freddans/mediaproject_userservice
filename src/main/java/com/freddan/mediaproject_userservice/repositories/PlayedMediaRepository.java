package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.entities.PlayedMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayedMediaRepository extends JpaRepository<PlayedMedia, Long> {
}
