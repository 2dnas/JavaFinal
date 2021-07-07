package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;

    @ToString.Exclude
    @ManyToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();



}
