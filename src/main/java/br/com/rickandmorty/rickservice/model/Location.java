package br.com.rickandmorty.rickservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Location {
    @Column(name = "location_name")
    private String name;
    @Column(name = "url_location")
    private String url;
}
