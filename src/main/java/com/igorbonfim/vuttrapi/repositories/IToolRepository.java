package com.igorbonfim.vuttrapi.repositories;

import com.igorbonfim.vuttrapi.models.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToolRepository extends JpaRepository<Tool, Integer> {
}
