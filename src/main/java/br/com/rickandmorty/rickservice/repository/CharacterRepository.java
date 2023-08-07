package br.com.rickandmorty.rickservice.repository;

import br.com.rickandmorty.rickservice.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Personagem, Long> {
}
