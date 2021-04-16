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
public class TesterPokemon {
    
      public static void main(String[] args) {
        
        TreinadorPokemon treinador = new TreinadorPokemon("Lucas", 0);
        Pokemon pokemon = new Pokemon("Charlizard","Fogo", 25.2, 4);
        
        TreinadorPokemon treinador2 = new TreinadorPokemon("David", 200);
        Pokemon pokemon2 = new Pokemon("Pikachu", "Eletrico", 20.2, 2);
        
        System.out.println(treinador.toString());
        System.out.println(treinador2.toString());
        System.out.println(pokemon.toString());
        System.out.println(pokemon2.toString());

        treinador.treinarPokemon(pokemon);
        treinador.treinarPokemon(pokemon);
        treinador.treinarPokemon(pokemon);
        treinador.treinarPokemon(pokemon);
        treinador.treinarPokemon(pokemon);
        treinador.treinarPokemon(pokemon);
        
        System.out.println(pokemon);
        
        
        treinador.evoluirPokemon(pokemon, "Mega Charlizard");
        
        System.out.println(pokemon);
        
        treinador2.treinarPokemon(pokemon2);
        treinador2.treinarPokemon(pokemon2);    
        
        System.out.println(pokemon2);
        
        treinador2.evoluirPokemon(pokemon2, "Raichu");
        
        System.out.println(pokemon2);
        System.out.println(treinador);
        System.out.println(treinador2);
        
    }
    
}
