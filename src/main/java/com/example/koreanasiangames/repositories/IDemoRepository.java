package com.example.koreanasiangames.repositories;

import com.example.koreanasiangames.entities.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDemoRepository extends JpaRepository<DemoEntity, Long> {
}
