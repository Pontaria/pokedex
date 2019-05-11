package br.com.fiap.pokedex.dao

import br.com.fiap.pokedex.R
import br.com.fiap.pokedex.model.Pokemon

class PokemonLocalDAO {


    fun pegarPokemon(): List<Pokemon> {
        return listOf(
                getPikachu(),
                getMewTow(),
                getBlastoise(),
                getCharizard(),
                getGengar(),
                getVenusaur()
        )
    }

    private fun getMewTow(): Pokemon {
        return Pokemon("MewTow",
                "Psychic",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png",
                "Mewtwo is a Pokémon that was created by genetic manipulation. However, even though the scientific power of humans created this Pokémon's body, they failed to endow Mewtwo with a compassionate heart",
                1,
                6,
                4,
                4,
                7)
    }

    private fun getPikachu(): Pokemon {
        return Pokemon("Pikachu",
                "Eletric",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png",
                "Whenever Pikachu comes across something new, it blasts it with a jolt of electricity. If you come across a blackened berry, it's evidence that this Pokémon mistook the intensity of its charge",
                1,
                3,
                2,
                2,
                5, R.raw.pikachu_4)
    }

    private fun getGengar(): Pokemon {
        return Pokemon(
                "Gengar",
                "Ghost",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/094.png",
                "Sometimes, on a dark night, your shadow thrown by a streetlight will suddenly and startlingly overtake you. It is actually a Gengar running past you, pretending to be your shadow",
                1,
                3,
                3,
                3,
                6)
    }

    private fun getBlastoise(): Pokemon {
        return Pokemon(
                "Blastoise",
                "Water",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png",
                "Blastoise has water spouts that protrude from its shell. The water spouts are very accurate. They can shoot bullets of water with enough accuracy to strike empty cans from a distance of over 160 feet",
                1,
                4,
                3,
                4,
                4)
    }

    private fun getCharizard(): Pokemon {
        return Pokemon(
                "Charizard",
                "Fire",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png",
                "Charizard flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself",
                1,
                4,
                3,
                3,
                5)
    }

    private fun getVenusaur(): Pokemon {
        return Pokemon(
                "Venusaur",
                "Grass",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png",
                "There is a large flower on Venusaur's back. The flower is said to take on vivid colors if it gets plenty of nutrition and sunlight. The flower's aroma soothes the emotions of people",
                1,
                4,
                3,
                4,
                4)
    }


}