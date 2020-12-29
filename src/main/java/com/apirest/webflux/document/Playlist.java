package com.apirest.webflux.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Playlist {

    public Playlist(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Id
    private String id;
    private String nome;

}
