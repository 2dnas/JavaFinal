package com.example.demo.model;

import lombok.Data;
import lombok.Generated;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String pdfUrl;
    @ToString.Exclude
    @OneToOne(mappedBy = "attachment",cascade = CascadeType.ALL)
    private Book book;

}
