package com.godo.spring.toyproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godo.spring.toyproject.entity.Board;
import com.godo.spring.toyproject.repository.BoardJpaRepo;

import java.util.List;

@RestController // @controller + @ResponseBody(json)
public class HelloRestController {
	@Autowired
	private BoardJpaRepo boardJpaRepo;
	
	@GetMapping("/board")
	public List<Board> findAllUser() {
        return boardJpaRepo.findAll();
    }
	
	@RequestMapping(value = "/boards")
    public Board save() {
        return boardJpaRepo.save(Board.builder()
                .boardName("테스트 게시글").build());

    }
}
