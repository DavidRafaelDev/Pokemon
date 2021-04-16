/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokemon2;

/**
 *
 * @author Desktop
 */
public class Pokemon {
    
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doce;

    public Pokemon(String nome, String tipo, Double forca, Integer doce) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doce = doce;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoce() {
        return doce;
    }

    public void setDoce(Integer doce) {
        this.doce = doce;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", tipo=" + tipo + ", forca=" + forca + ", doce=" + doce + '}';
    }
    
    
    
}
