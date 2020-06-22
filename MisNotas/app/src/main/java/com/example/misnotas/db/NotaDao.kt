package com.example.misnotas.db


import androidx.lifecycle.LiveData
import androidx.room.Dao

@Dao
interface NotaDao {

    @Query("SELECT * FROM tabla-notas")
    fun getAllNotas(): LiveData<List<Nota>>

    @Insert
    suspend fun insert(nota:Nota)
}