package com.example.myappdemokotlin.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myappdemokotlin.entities.Recipies


@Dao
interface RecipeDao {


    @get:Query(value = "SELECT * FROM recipes ORDER BY id DESC")
    val  allPecipes: List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies: Recipies)
}