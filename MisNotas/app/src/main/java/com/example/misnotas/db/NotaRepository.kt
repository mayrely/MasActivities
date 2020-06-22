package com.example.misnotas.db

import androidx.lifecycle.LiveData

class NotaRepository(private val notaDao: NotaDao) {

    val getAllNotas:LiveData<List<Notas>> = notaDao.getAllNotas()

    suspend fun insert:(nota:Nota){
        notaDao.insert(nota)
    }
}