package br.com.rickandmorty.rickservice.service;

import br.com.rickandmorty.rickservice.http.CharacterClient;
import br.com.rickandmorty.rickservice.model.DetalhaPersonagem;
import br.com.rickandmorty.rickservice.model.ListaDetalhaPersonagens;
import br.com.rickandmorty.rickservice.model.Personagem;
import br.com.rickandmorty.rickservice.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {

    @Autowired
    private CharacterRepository repository;

    @Autowired
    CharacterClient client;

    public void cadastrarTodosPersonagensNoBanco(){
        ListaDetalhaPersonagens listaDetalhaPersonagens = client.allPersonagens();
        for (DetalhaPersonagem detalhaPersonagem: listaDetalhaPersonagens.results()
             ) {
            Personagem personagem = new Personagem(detalhaPersonagem.id(), detalhaPersonagem.name(), detalhaPersonagem.status(), detalhaPersonagem.species(),
                    detalhaPersonagem.type(), detalhaPersonagem.gender(), detalhaPersonagem.origin(), detalhaPersonagem.location(), detalhaPersonagem.image(),
                    detalhaPersonagem.episode());

            repository.save(personagem);
        }


    }

    public DetalhaPersonagem getPersonagemById(Long id){
        DetalhaPersonagem detalhaPersonagem = client.character(id);
        return detalhaPersonagem;
    }

    public ListaDetalhaPersonagens getAllPersonagens(){
        return client.allPersonagens();
    }

    public String getSizeListaDetalhaPersonagens(Long id){
        DetalhaPersonagem personagem = client.character(id);
        return "Número de episódios que o: "+personagem.name()+", participou:"+personagem.episode().size();
    }

}
