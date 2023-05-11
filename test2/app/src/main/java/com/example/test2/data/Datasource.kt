package com.example.test2.data

import com.example.test2.R
import com.example.test2.model.Favorite

class Datasource {
    fun loadFavorites(): List<Favorite> {
        return listOf<Favorite>(
            Favorite(R.string.movie1),
            Favorite(R.string.movie2),
            Favorite(R.string.movie3),
            Favorite(R.string.place1),
            Favorite(R.string.place2)
        )
    }
}