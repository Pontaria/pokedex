package br.com.fiap.pokedex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import br.com.fiap.pokedex.dao.PokemonLocalDAO
import kotlinx.android.synthetic.main.activity_lista_pokemon.*

class ListaPokemonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pokemon)

        val pokemonDAO = PokemonLocalDAO()
        val pokemons = pokemonDAO.pegarPokemon()

        rvPokemon.adapter = ListaPokemonAdapter(pokemons,this,{
            val intent = Intent(this,PokemonActivity::class.java)
            intent.putExtra("POKEMON",it)
            startActivity(intent)
        })

        rvPokemon.layoutManager = GridLayoutManager(this  ,3)


    }
}
