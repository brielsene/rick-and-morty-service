package br.com.rickandmorty.rickservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Origin {
    @Column(name = "origin_name")
    private String name;
    @Column(name = "origin_url")
    private String url;
}
