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
public class TreinadorPokemon {
    private String nome;
    private Integer nivel;

    
    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
        @Override
    public String toString() {
        return "TreinadorPokemon{" + "nome=" + nome + ", nivel=" + nivel + '}';
    }
    
    public void treinarPokemon(Pokemon pokemon){
        Double forca = pokemon.getForca() + 0.5;
        pokemon.setForca(forca);
        
        Integer doce = pokemon.getDoce() + 10;   
        pokemon.setDoce(doce);   
        
        this.nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String evolucao){
        if(pokemon.getDoce() >= 50){
            System.out.println("Pokemon "+ pokemon.getNome() + " evoluiu para "+evolucao); 
            pokemon.setNome(evolucao);
            Integer doce = pokemon.getDoce() - 50;
            pokemon.setDoce(doce);
            this.nivel += 10;
        }else{
            System.out.println("Doces Insuficiente");
        }
    }
}
