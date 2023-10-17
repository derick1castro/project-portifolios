package com.backend.portifolios.Portifolio.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_solucoes")
public class Solucao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private String descricaoCurta;
    private String indtech;
    private String caracteristica;
    private String dores;
    private String caso;
    private String link;
    private String image;

    public Solucao(){}

    public Solucao(Long id, String titulo, String descricao, String descricaoCurta, String indtech, String caracteristica, String dores, String caso, String link, String image) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.descricaoCurta = descricaoCurta;
        this.indtech = indtech;
        this.caracteristica = caracteristica;
        this.dores = dores;
        this.caso = caso;
        this.link = link;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getIndtech() {
        return indtech;
    }

    public void setIndtech(String indtech) {
        this.indtech = indtech;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDores() {
        return dores;
    }

    public void setDores(String dores) {
        this.dores = dores;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
