package com.example.misnotas

import android.app.Application
import android.app.application
import androidx.lifecycle.androidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.misnotas.db.Nota
import com.example.misnotas.db.NotasDatabaseRoom
import com.example.misnotas.db.NotaRepository
import kotlinx.coroutines.launch



class NotaViewModel(application: Application): androidViewModel(application) {

    private  val repository:NotaRepository

    val allNota: LiveData<List<Nota>>

    init {
        val notaDao = NotaDatabaseRoom.getDatabase(application).notaDao()
        repository = NotaRepository(notaDao)
        allNota = repository.getAllNotas
    }

    fun insert(Nota) = viewModelScape.lauch(Dispatchers.IO){
        repository.insert(nota)
    }
}