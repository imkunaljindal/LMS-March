package com.backendMarch.librarymanagementsystem.Entity;

import com.backendMarch.librarymanagementsystem.Enum.Genre;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private int price;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Author author;
}
