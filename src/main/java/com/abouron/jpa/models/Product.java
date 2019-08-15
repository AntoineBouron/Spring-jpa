package com.abouron.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFilter;

@Entity
@JsonFilter("monFiltreDynamique")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    private String nom;
    private int prix;

    private int prixAchat;
  }