package com.godo.spring.toyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godo.spring.toyproject.entity.Board;

public interface BoardJpaRepo  extends JpaRepository<Board, Integer> {

}
