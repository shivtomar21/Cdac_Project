package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
