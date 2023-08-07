package br.com.rickandmorty.rickservice.http;

import br.com.rickandmorty.rickservice.model.DetalhaPersonagem;
import br.com.rickandmorty.rickservice.model.ListaDetalhaPersonagens;
import br.com.rickandmorty.rickservice.model.Personagem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "rick-and-morty-api", url = "https://rickandmortyapi.com/api/character")
public interface CharacterClient {

    @GetMapping("/{id}")
    DetalhaPersonagem character(@PathVariable("id")Long id);


    @GetMapping
    ListaDetalhaPersonagens allPersonagens();

}
