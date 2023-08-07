package br.com.rickandmorty.rickservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "personagem")
public class Personagem {
    @Id
    private Long id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    @Embedded
    private Origin origin;
    @Embedded
    private Location location;
    private String image;
    @ElementCollection
    private List<String> episode;



    /*

    "id": 1,
"name": "Rick Sanchez",
"status": "Alive",
"species": "Human",
"type": "",
"gender": "Male",
"origin": {
"name": "Earth (C-137)",
"url": "https://rickandmortyapi.com/api/location/1"
},
"location": {
"name": "Citadel of Ricks",
"url": "https://rickandmortyapi.com/api/location/3"
},
"image": "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
"episode": [],
"url": "https://rickandmortyapi.com/api/character/1",
"created": "2017-11-04T18:48:46.250Z"
}
     */
}
