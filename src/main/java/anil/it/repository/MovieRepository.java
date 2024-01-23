package anil.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import anil.it.entity.Movie;

@RepositoryRestResource(path = "movie")
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
