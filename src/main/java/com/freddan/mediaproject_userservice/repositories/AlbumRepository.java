package com.freddan.mediaproject_userservice.repositories;

import com.freddan.mediaproject_userservice.vo.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
