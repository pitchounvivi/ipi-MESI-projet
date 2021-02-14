package com.ldvelh.rpg.repository;

import com.ldvelh.rpg.model.Chapitre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapitreRepository extends JpaRepository<Chapitre, Integer> {
}
