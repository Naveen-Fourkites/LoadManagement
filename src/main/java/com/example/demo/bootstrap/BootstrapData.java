package com.example.demo.bootstrap;

import com.example.demo.Repository.AuthorRepository;
import com.example.demo.Repository.BookRepository;
import com.example.demo.Repository.PublisherRepository;
import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.domain.Publiser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {



    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepositor;


    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository , PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepositor = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Publiser pub1=new Publiser();



        Author auth1 =new Author("Naveen");
        Book python=new Book("python","34343");
        authorRepository.save(auth1);
        bookRepository.save(python);

        python.setPubliser(new Publiser());

        Author auth2 =new Author("Rey");
        Book spring=new Book("spring","34343");
        authorRepository.save(auth2);
        bookRepository.save(spring);

        System.out.println("THe bootstrap sarted....");
        System.out.println("No of book>>>>>>:  "+bookRepository.count());


    }
}
