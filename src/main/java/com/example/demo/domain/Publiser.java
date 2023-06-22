package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publiser {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String p_name;

    @OneToMany
    @JoinColumn(name = "Publisher_id")
    private Set<Book> books=new HashSet<>();

    public Publiser() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Publiser(String p_name) {
        this.p_name = p_name;
    }


    @Override
    public String toString() {
        return "Publiser{" +
                "p_name='" + p_name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publiser publiser = (Publiser) o;
        return Objects.equals(p_name, publiser.p_name) && Objects.equals(books, publiser.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p_name, books);
    }
}
