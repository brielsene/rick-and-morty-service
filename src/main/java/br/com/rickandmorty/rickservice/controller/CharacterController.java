package br.com.rickandmorty.rickservice.controller;

import br.com.rickandmorty.rickservice.http.CharacterClient;
import br.com.rickandmorty.rickservice.model.DetalhaPersonagem;
import br.com.rickandmorty.rickservice.model.ListaDetalhaPersonagens;
import br.com.rickandmorty.rickservice.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    private CharacterClient characterClient;

    @Autowired
    private PersonagemService personagemService;


    @GetMapping("/{id}")
    public ResponseEntity<DetalhaPersonagem>getCharacter(@PathVariable("id")Long id){
        return ResponseEntity.status(HttpStatus.OK).body(personagemService.getPersonagemById(id));

    }

    @GetMapping
    public ResponseEntity<ListaDetalhaPersonagens>getAllPersonagens(){
        return ResponseEntity.status(HttpStatus.OK).body(personagemService.getAllPersonagens());
    }

    @GetMapping("/cadastra")
    public ResponseEntity cadastraNoBanco(){
        personagemService.cadastrarTodosPersonagensNoBanco();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/episodes/{id}")
    public ResponseEntity<String> getNumber(@PathVariable("id")Long id){
        return ResponseEntity.status(HttpStatus.OK).body(personagemService.getSizeListaDetalhaPersonagens(id));
    }


}
