package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.vo.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
