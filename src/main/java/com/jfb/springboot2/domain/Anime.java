package com.jfb.springboot2.domain;

public class Anime {

  private String nome;

  public Anime() {
  }

  public Anime(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
