package com.jfb.springboot2.controllers;

import java.util.List;

import com.jfb.springboot2.domain.Anime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/animes")
public class AnimeController {
  
  @GetMapping(value = "/list")
  public List<Anime> list() {
    return List.of(new Anime("DBZ"), new Anime("Berserker"));
  }
}
