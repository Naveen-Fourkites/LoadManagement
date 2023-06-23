package com.example.demo.bootstrap;

import com.example.demo.Repository.LoadRepository;
import com.example.demo.Repository.Stoprepository;
import com.example.demo.domain.Loads;
import com.example.demo.domain.Stops;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootData implements CommandLineRunner {

    private final LoadRepository loadRepository;
    private final Stoprepository stoprepository;

    public BootData(LoadRepository loadRepository, Stoprepository stoprepository) {
        this.loadRepository = loadRepository;
        this.stoprepository = stoprepository;
    }





    @Override
    public void run(String... args) {
        Loads load=new Loads(1,"234" , 12);

        loadRepository.save(load);

        Stops stop=new Stops("Chennai");

        stoprepository.save(stop);

        System.out.println("from secondddddddddddd");

        System.out.println("data from Loads:   "+stop.getAddress());

    }
}
