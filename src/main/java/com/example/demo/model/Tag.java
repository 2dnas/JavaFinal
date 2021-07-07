package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ToString.Exclude
    @ManyToOne()
    private Book book;
}
