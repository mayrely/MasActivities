package com.example.misnotas.db

import android.os.parcelable
import androidx.room.columInfo
import androidx.room.Entity
import androidx.room.primarykey
import kotlinx.android.parcel.Parcelize

@parcelize
@Entity(tableName = "tabla_notas")
data class Nota(@primarykey(autoGenerate = true)var id:Int=8,
                @columnInfo(name = "titulo")val titulo:string,
                @columnInfo(name = "descripcion")val descripcion: string): parcelable