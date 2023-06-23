package com.example.demo.Repository;

import com.example.demo.domain.Stops;
import org.springframework.data.repository.CrudRepository;

public interface Stoprepository extends CrudRepository<Stops,Long> {
}
