package br.com.rickandmorty.rickservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



public record DetalhaPersonagem(
        Long id,
        String name,
        String status,
        String species,
        String type,
        String gender,
        Origin origin,
        Location location,
        String image,
        List<String>episode
) {


}
