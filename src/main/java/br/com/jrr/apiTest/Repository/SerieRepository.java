package br.com.jrr.apiTest.Repository;


import br.com.jrr.apiTest.Serie.Serie;
import br.com.jrr.apiTest.domain.Movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SerieRepository extends JpaRepository<Serie, UUID> {
}
