package com.example.misnotas.db

import android.content.context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Nota::class), version = 1, exportSchema = false)
public abstract class NotasDatabaseRoom: RoomDatabase() {

    abstract fun notaDao(): NotaDao

    companion object{
        @Volatile
        private var INSTANCE: NotasDatabaseRoom? = null

        fun getDatabase(context:context):NotasDatabaseRoom{
            val tempInstances = INSTANCE
            if (tempInstances!=null){
                return tempInstances
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationcontext,
                    NotaDatabaseRoom::class.java,
                    "notas_database"
                ).build()
                INSTANCE= instance
                return instance
            }
        }
    }
}