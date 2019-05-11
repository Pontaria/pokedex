package br.com.fiap.pokedex

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.fiap.pokedex.model.Pokemon
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_pokemon.*

class PokemonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        val pokemon = intent.extras.getParcelable<Pokemon>("POKEMON")
        Toast.makeText(this,pokemon.nome,Toast.LENGTH_LONG).show()

        tvNome.text = pokemon.nome
        Picasso.get().load(pokemon.imagem).into(ivPokemon)
        tvDescricao.text = pokemon.descricao
        tvAtaque.text = pokemon.ataque.toString()
        tvPs.text = pokemon.ps.toString()
        tvDefesa.text = pokemon.defesa.toString()
        tvVelocidade.text = pokemon.vel.toString()


        if(pokemon.som != 0) {
            val mediaPlayer = MediaPlayer.create(this, pokemon.som)
            //Inicia o audio
            mediaPlayer.start();
        }

    }
}
